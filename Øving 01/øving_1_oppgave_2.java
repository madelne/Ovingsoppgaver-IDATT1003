package Øving_1;

import java.util.Scanner;

public class øving_1_oppgave_2 {

    public static String tidISekunder(int timer, int minutter, int sekunder){
           
        if(timer < 0.0){
            return "Timer kan ikke vere mindre enn null";
        }
        if(minutter < 0.0){
            return "Minutter kan ikke vere mindre enn null";
        }
        if(sekunder < 0.0){
            return "Sekunder kan ikke vere mindre enn null";
        }else{
            double totalSekunder = timer * 3600 + minutter * 60 + sekunder;
        return "Totalt antall sekunder: " + totalSekunder;
        }
        
    }
    public static void main(String[]args){

        int timerPos = 4;
        int minutterPos = 34;
        int sekunderPos = 12;
        int timerNeg = -23;
        int minutterLik0 = 0;

        String test1 = øving_1_oppgave_2.tidISekunder(timerPos, minutterPos, sekunderPos);
        System.out.println(test1);
        String test2 = øving_1_oppgave_2.tidISekunder(timerNeg, minutterPos, sekunderPos);
        System.out.println(test2);
        String test3 = øving_1_oppgave_2.tidISekunder(timerPos, minutterLik0, sekunderPos);
        System.out.println(test3);
    }
}
