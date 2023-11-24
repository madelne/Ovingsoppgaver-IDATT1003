import java.util.Scanner;

public class main {

    public static void main(String[]args){

    Person LarsFjell = new Person("Lars", "Fjell", 1979);
    ArbTaker LarsFjellJobb = new ArbTaker(LarsFjell, 111666000, 1988, 70000, 10);

    System.out.println(LarsFjellJobb.getArbtakernr());
    System.out.println(LarsFjellJobb.getAnsettelsesår());
    System.out.println(LarsFjellJobb.getMånedslønn());
    System.out.println(LarsFjellJobb.getSkatteprosent());
    LarsFjellJobb.setMåndeslønn(80000);
    System.out.println(LarsFjellJobb.getMånedslønn());
    LarsFjellJobb.setSkatteprosent(15);
    System.out.println(LarsFjellJobb.getSkatteprosent());

    Scanner input = new Scanner(System.in);

    System.out.println("1: Sett månedslønn\n2: Sett skatteprosent\n3: Avslutt");
    int valgmulighet = Integer.parseInt(input.nextLine());
    while(valgmulighet!=3){
        switch(valgmulighet){
            case 1:
                System.out.print("Skriv inn ny månedslønn:");
                int nyLønn = input.nextInt();
                LarsFjellJobb.setMåndeslønn(nyLønn);
                System.out.println(LarsFjellJobb.getMånedslønn());
                break;
            case 2:
                System.out.println("Skriv inn ny skatteprosent:");
                int nySkatt = input.nextInt();
                LarsFjellJobb.setSkatteprosent(nySkatt);
                break;
            default:
                System.out.println(valgmulighet+" er ikke en valgmulighet");  
        }
        System.out.println("1: Sett månedslønn\n2: Sett skatteprosent\n3: Avslutt");
        valgmulighet = input.nextInt();
    }
    

    }


    
    
}
