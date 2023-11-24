import java.util.ArrayList;
import java.util.Scanner;

public class Meny {
    
    private int visMeny(){
        int valg = 0;
        System.out.println("\n----- Eiendoms Register -----\n");
        System.out.println("1. Registrer ny eiendom\n");
        System.out.println("2. Skriv ut registrerte eiendommer\n");
        System.out.println("3. Søk etter eiendom\n");
        System.out.println("4. Gjennomsnitts areal av alle registrerte eiendommer\n");
        System.out.println("5. Avslutt");
        Scanner input = new Scanner(System.in);
        valg = Integer.parseInt(input.nextLine());
        if(valg==1 || valg==2 || valg==3 || valg==4 || valg==5){
            return valg;
        }
        else{
            System.out.println("Valget må være et tall mellom 1 og 5");
        }
        return valg;
    }

    public void startMeny(){
        boolean avslutt = false;
        Scanner input = new Scanner(System.in);
        ArrayList<Eiendom> eiendommer = new ArrayList<Eiendom>();
        EiendomsRegister register = new EiendomsRegister(eiendommer);
        while(!avslutt){
            int valg = visMeny();
            switch(valg){
                case 1:
                    System.out.println("Kommunenummer:");
                    int kommunenr = Integer.parseInt(input.nextLine());
                    System.out.println("Kommunenavn:");
                    String kommunenavn = input.nextLine();
                    System.out.println("Gatenummer:");
                    int gnr = Integer.parseInt(input.nextLine());
                    System.out.println("Bruksnummer:");
                    int bnr = Integer.parseInt(input.nextLine());
                    System.out.println("Bruksnavn:");
                    String bruksnavn = input.nextLine();
                    System.out.println("Areal:");
                    double areal = Double.parseDouble(input.nextLine());
                    System.out.println("Eiernavn:");
                    String eiernavn = input.nextLine();
                    if(bruksnavn!=null){
                        Eiendom nyEiendom = new Eiendom(kommunenr, kommunenavn, gnr, bnr, bruksnavn, areal, eiernavn);
                        eiendommer.add(nyEiendom);
                    }else{
                        Eiendom nyEiendom = new Eiendom(kommunenr, kommunenavn, gnr, bnr, areal, eiernavn);
                        eiendommer.add(nyEiendom);
                    }
                    break;
                case 2:
                    System.out.println(register.getEiendommer());
                    break;
                case 3:
                    System.out.println("Kommunenummer:");
                    int kommunenr2 = Integer.parseInt(input.nextLine());
                    System.out.println("Gårdsnummer:");
                    int gnr2 = Integer.parseInt(input.nextLine());
                    System.out.println("Bruksnummer:");
                    int bnr2 = Integer.parseInt(input.nextLine());
                    System.out.println(register.finnEiendom(kommunenr2, gnr2, bnr2));
                    break;
                case 4:
                    System.out.println(register.gjennomsnittsAreal());
                    break;
                case 5:
                    avslutt=true;
                    break;
                default:
                    System.out.println("Menyvalget finnes ikke");
            }
        }
    }

}
