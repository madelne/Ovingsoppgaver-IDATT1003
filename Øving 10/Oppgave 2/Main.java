import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[]args){
        long tid = 201011021700L;
        long tid2 = 202311031800L;
        long tid3 = 202311042020L;

        System.out.println("1. Registrer nytt arrangement\n2. Lagre i registeret\n3. Finn arangementene på et gitt sted\n4. Finn alle arrangementer på en gitt dato\n5. Alle arrangementer innenfor et gitt tidsintervall\n6. Sorter arrangementene\n7. Avslutt");
        Scanner input = new Scanner(System.in);
        int valg = Integer.parseInt(input.nextLine());
        int nummer;
        String navn;
        String sted;
        String arrangør;
        String type;
        long tidspunkt;
        ArrayList<Arrangement> liste = new ArrayList<Arrangement>();
        ArrangementRegister register = new ArrangementRegister(liste);

        while(valg!=7){
            switch(valg){
                case 1: 
                    System.out.println("Nummer:");
                    nummer = Integer.parseInt(input.nextLine());
                    System.out.println("Navn:");
                    navn = input.nextLine();
                    System.out.println("Sted:");
                    sted = input.nextLine();
                    System.out.println("Arrangør:");
                    arrangør = input.nextLine();
                    System.out.println("Type:");
                    type = input.nextLine();
                    System.out.println("Tidspunkt");
                    tidspunkt = Long.parseLong(input.nextLine());
                    Arrangement nyttArrangement = new Arrangement(nummer, navn, sted, arrangør, type, tidspunkt);
                    liste.add(nyttArrangement);
                    break;
                case 2:
                    register = new ArrangementRegister(liste);
                    break;
                case 3: 
                    System.out.println("Skriv inn sted:");
                    String sted2 = input.nextLine();
                    System.out.println(register.arrangementPåSted(sted2));
                    break;
                case 4:
                    System.out.println("Skriv inn dato:");
                    long dato2 = Integer.parseInt(input.nextLine());
                    System.out.println(register.arrangementPåDato(dato2));
                    break;
                case 5:
                    System.out.println("Skriv inn tidsintervall:");
                    int startDato = Integer.parseInt(input.nextLine());
                    int sluttDato = Integer.parseInt(input.nextLine());
                    System.out.println(register.arrangementTidsintervall(startDato, sluttDato));
                    break;
                case 6:
                    System.out.println(register.arrangementerSortert());
                    break;
                default:
                    System.out.println("Din input er ikke en valgmulighet");
            }
            System.out.println("1. Registrer nytt arrangement\n2. Lagre i registeret\n3. Finn arangementene på et gitt sted\n4. Finn alle arrangementer på en gitt dato\n5. Alle arrangementer innenfor et gitt tidsintervall\n6. Sorter arrangementene\n7. Avslutt");
            valg = Integer.parseInt(input.nextLine());
        }
        Arrangement fest = new Arrangement(10, "fest", "hjemme", "madde", "party", tid);
        Arrangement fest1 = new Arrangement(11, "fest2", "hjemme", "noen", "party", tid2);
        Arrangement fest3 = new Arrangement(12, "fest3", "hos moren din", "moren din", "party4real", tid3);


        Rett potetsuppe = new Rett("Potetsuppe", "forrett", 190, "potet, vann, purre, løk");
        Rett pannacotta = new Rett("pannacotta", "dessert", 120, "sukker, lime, fløte, vaniljestang, gelatin");
        Rett pizza = new Rett("pizza", "hovedrett", 210, "mel, vann, salt, olje, topping");
        Rett dumplings = new Rett("dumplings", "forrett", 75, "mel, vann, kål, gulrot, vårløk, kylling");

        ArrayList<Rett> menyRetter = new ArrayList<Rett>();
        menyRetter.add(potetsuppe);
        menyRetter.add(pizza);
        Meny meny1 = new Meny("meny1", menyRetter);

        ArrayList<Rett> menyRetter2 = new ArrayList<Rett>();
        menyRetter2.add(pannacotta);
        menyRetter2.add(dumplings);
        menyRetter2.add(pizza);
        Meny meny2 = new Meny("meny2", menyRetter2);

        Meny[] registerListe = {meny1, meny2};

        MenyRegister registerTest = new MenyRegister(registerListe);

        System.out.println(registerTest.finnRett("pannacotta"));
        System.out.println(registerTest.retterAvType("forrett"));
        System.out.println(registerTest.totalPrisIIntervall(200, 700));
    }
}
