import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class oppgave1Random {
    
    static java.util.Random random = new java.util.Random();

    public static List<Integer> tilfeldigLokke(int størrelse){

        List<Integer> antall = new ArrayList<Integer>();
        Collections.addAll(antall, 0,0,0,0,0,0,0,0,0,0);

        for(int i=0; i<=størrelse; i++){
            int tall = random.nextInt(10);
            int alleredeTellt = antall.get(tall);
            antall.set(tall, alleredeTellt + 1);
        }

        return antall;
    }
    

    public static void main(String[]args){
        
        List<Integer> test = tilfeldigLokke(1000);
        System.out.println(test);
    }
    
}
