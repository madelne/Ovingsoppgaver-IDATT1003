package Øving_4;

import java.util.Scanner;
import java.lang.Math;

public class valuta {

    double sattBelop;
    double sattValuta;
    
    public valuta(double belop, double valuta){
        sattBelop = belop;
        sattValuta = valuta;
    }

    public static String tilNorskeKroner(valuta veksling){
        String valutaNavn = "";

        if (veksling.sattValuta == 1){
            valutaNavn = "Dollar";
            veksling.sattValuta = 10.70;
        }

        if (veksling.sattValuta == 2){
            valutaNavn = "Euro";
            veksling.sattValuta = 11.56;
        }

        if (veksling.sattValuta == 3){
            valutaNavn = "Svenske kroner";
            veksling.sattValuta = 0.98;
        }

        double resultat = Math.round(veksling.sattValuta*veksling.sattBelop);
        return (String.format("%s %s = %s NOK", veksling.sattBelop, valutaNavn, resultat));
    }

    public static String fraNorskeKroner(valuta veklsing){
        String valutaNavn = "";

        if (veklsing.sattValuta == 1){
            valutaNavn = "Dollar";
            veklsing.sattValuta = 10.70;
        }

        if (veklsing.sattValuta == 2){
            valutaNavn = "Euro";
            veklsing.sattValuta = 11.56;
        }

        if (veklsing.sattValuta == 3){
            valutaNavn = "Svenske kroner";
            veklsing.sattValuta = 0.98;
        }

        double resultat = Math.round(veklsing.sattBelop/veklsing.sattValuta);
        return (String.format("%s NOK = %s %s", veklsing.sattBelop, resultat, valutaNavn));
    }

    
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Velg valuta:\n\n1: Dollar\n2: Euro\n3: Svenske kroner\n4: Fra norske kroner\n5: Avslutt");
        double valutaValg = Double.parseDouble((input.nextLine()));
        if (valutaValg != 5){
            System.out.println("Skriv inn belop");
            double belop = Double.parseDouble((input.nextLine()));
            valuta veksling1 = new valuta(belop, valutaValg);

            if ((valutaValg == 1) || (valutaValg == 2) || (valutaValg == 3)){
                System.out.println(tilNorskeKroner(veksling1));
            }

            if (valutaValg == 4){
                System.out.println("Velg valuta:\n\n1: Dollar\n2: Euro\n3: Svenske kroner");
                valutaValg = Double.parseDouble((input.nextLine()));
                valuta veksling2 = new valuta(belop, valutaValg);
                System.out.println(fraNorskeKroner(veksling2));
            }

            if (valutaValg > 5){
                System.out.println(valutaValg+" er ikke en valgmulighet");
            }
        }
    }
}
