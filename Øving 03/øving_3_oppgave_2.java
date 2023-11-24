package Øving_3;

import java.util.Scanner;

public class øving_3_oppgave_2 {

    public static String sjekkPrimtall(int tall){
        String resultat = String.format("%d er et primtall\n", tall);
        for (int i=2; i<tall; i++){
            if(tall != 2){
                if (tall%i == 0){
                    resultat = String.format("%d er ikke et primtall\n", tall);
                }   
            }
        }
        return resultat;
    }
    public static void main(String[]args){
        
        int tall = 1;
        do{
            Scanner input = new Scanner(System.in);
            System.out.println("Skriv inn tall: (skriv 0 for å avslutte)");
            tall = Integer.parseInt(input.nextLine());
            String test = sjekkPrimtall(tall);
            System.out.println(test);
        }while(tall != 0);
        
    }
}
