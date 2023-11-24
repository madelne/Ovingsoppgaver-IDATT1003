import java.util.Random;

public class MinRandom {

    static Random tilfeldigTall = new Random();
    
    public static int nesteHeltall(int nedre, int ovre){
        int heltall = tilfeldigTall.nextInt(ovre-nedre+1)+nedre;
        return heltall;
    }

    public static double nesteDesimaltall(double nedre, double ovre){
        double desimaltall = tilfeldigTall.nextDouble(ovre-nedre+1)+nedre;
        return desimaltall;
    }

    public static void main(String[]args){
        int nyttheltall = nesteHeltall(8,10);
        double nyttdesimaltall = nesteDesimaltall(2.2, 3.3);
        System.out.println(nyttheltall);
        System.out.println(nyttdesimaltall);
    }
}
