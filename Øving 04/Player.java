package Øving_4;

import java.util.Random;
import java.util.Scanner;

public class Player {

    String spiller;
    int sumPoeng;
    boolean spillStatus;
    static Random terning = new Random();

    public Player(String navn, int poeng){
        spiller = navn;
        sumPoeng = poeng;
    }

    public static int getSumPoeng(Player spiller){
        return spiller.sumPoeng;
    }

    public static int kastTerningen(){
        int terningKast = terning.nextInt(6);
        return terningKast+1;
    }

    public static String erFerdig(String vinner){
        String spillStatus = "Spillet er ferdig, "+vinner+" vant.";
        return spillStatus;
    }

    public static void main(String[]args){
        int sumA = 0;
        int sumB = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Navn på forste spiller:");
        String navnA = input.nextLine();
        System.out.println("\nNavn på andre spiller:");
        String navnB = input.nextLine();
        Player A = new Player(navnA, sumA);
        Player B = new Player(navnB, sumB);
        
        Player sisteKast = A;
        while(getSumPoeng(A) < 100 && getSumPoeng(B) < 100){
            if(sisteKast == A){
                sisteKast = B;
            }
            else if(sisteKast == B){
                sisteKast = A;
            }
            int terningKast = kastTerningen();
            sisteKast.sumPoeng = sisteKast.sumPoeng + terningKast;
            System.out.println(String.format("Sum %s: %s", sisteKast.spiller, getSumPoeng(sisteKast)));
        }
        String vinner = "";
        if(A.sumPoeng < B.sumPoeng){
            vinner = B.spiller;
        }
        else{
            vinner = A.spiller;
        }
        System.out.println(erFerdig(vinner));
    }
}
