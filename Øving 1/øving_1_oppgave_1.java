package Øving_1;
import java.util.Scanner;

public class øving_1_oppgave_1 {

    public static String tommerTilCenti(double tommer){
        double centi = tommer * 2.54;

        if(centi < 0.0){
            return ("Tommer kan ikke vere under null");
        }else{
            return ("Antall centimeter: " + centi);
        }
    }
    public static void main(String[]args){

        double PositivtTall = 4.0;
        double NegativtTall = -10.0;

        String test1 = øving_1_oppgave_1.tommerTilCenti(PositivtTall);
        System.out.println(test1);
        String test2 = øving_1_oppgave_1.tommerTilCenti(NegativtTall);
        System.out.println(test2);
    }
}