package Øving_3;

import java.util.Scanner;

public class øving_3_oppgave_1 {

    public static String gangeTabellen(int fra, int til){

        do{
            String tabell = String.format("Gangetabellen fra %d til %d:", fra, til);
            for (int i = fra; i <= til; i++){
                tabell = tabell + String.format("\n\n\n%d-gangen:\n", i);
                for(int j = 1; j <= 10; j++){
                    int svar = i*j;
                    tabell = tabell + String.format("\n%d x %d = %d", i,j,svar); 
                }
            }
            return tabell;
        }while(fra<100 && til<100);
        
    }

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Fra:");
        int fra = Integer.parseInt(input.nextLine());
        System.out.println("Til:");
        int til = Integer.parseInt(input.nextLine());
        String test1 = gangeTabellen(fra, til);
        System.out.println(test1);
    }
}
