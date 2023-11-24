import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    

    public static void main(String[]args){
        /**
        Eiendom e1 = new Eiendom(1445, "Gloppen", 77, 631, 1017.6, "Jens Olsen");
        Eiendom e2 = new Eiendom(1445, "Gloppen", 77, 131, "Syningom", 661.3, "Nicolay Madsen");
        Eiendom e3 = new Eiendom(1445, "Gloppen", 75, 19, "Fugletun", 650.6, "Evilyn Jensen");
        Eiendom e4 = new Eiendom(1445, "Gloppen", 74, 188, 1457.2, "Karl Ove Bråthen");
        Eiendom e5 = new Eiendom(1445, "Gloppen", 69, 47, "Høiberg", 1339.4, "Elsa Indregård");

        ArrayList<Eiendom> eiendommer = new ArrayList<Eiendom>();
        eiendommer.add(e1);
        eiendommer.add(e2);
        eiendommer.add(e3);
        eiendommer.add(e4);
        eiendommer.add(e5);

        EiendomsRegister register = new EiendomsRegister(eiendommer);
        register.slettEiendom(e5);
        System.out.println(register.antallEiendommer());
        register.registrerNyEiendom(e5);
        System.out.println(register.antallEiendommer());

        System.out.println(register.finnEiendom(1445, 77, 631));
        System.out.println(register.gjennomsnittsAreal());
        System.out.println(register.eiendommerMedGnr(75));
        */
        Meny meny = new Meny();
        meny.startMeny();
    }
}
