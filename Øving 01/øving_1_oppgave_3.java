package Øving_1;

import java.util.Scanner;

public class øving_1_oppgave_3{

    public static String tidITimerMinutterSekunder (int sekunder){
        int restTimer = sekunder % 3600;
        int timer = (sekunder - restTimer) / 3600;
        int restMinutter = restTimer % 60;
        int minutter = (sekunder - timer - restMinutter) / 60;

        if(sekunder < 0.0){
            return "Sekunder kan ikke vere mindre enn null";
        }else{
            return "Antall timer:    " + timer + "\nAntall minutter: " + minutter + "\nAntall sekunder: " + sekunder;
        }

    }

    public static void main(String[]args){

        int sekunderPos = 4876;
        int sekunderNeg = -399;

        String test1 = øving_1_oppgave_3.tidITimerMinutterSekunder(sekunderPos);
        System.out.println(test1);
        String test2 = øving_1_oppgave_3.tidITimerMinutterSekunder(sekunderNeg);
        System.out.println(test2);

    }
}