package Øving_2;
import java.util.Scanner;

public class øving_2_oppgave_1 {

    public static String Skuddar(int ar){
        if(ar < 0){
            return "Arstall kan ikke vere mindre enn null";
        }else{
            if(ar % 100 == 0){
                if(ar % 400 == 0){
                    return ar + "er et skuddar";
                }else{
                    return ar + "er ikke et skuddar";
                }
            }else if(ar % 4 == 0){
                return ar + "er et skuddar";
            }
            else{
                return ar + "er ikke et skuddar";
            }
        }
    }
    public static void main(String[]args){

        int skudd = 3400;
        int ikkeSkudd = 2023;
        int negativ = -200;

        String test1 = Skuddar(skudd);
        System.out.println(test1);
        String test2 = Skuddar(ikkeSkudd);
        System.out.println(test2);
        String test3 = Skuddar(negativ);
        System.out.println(test3);

    }

}
