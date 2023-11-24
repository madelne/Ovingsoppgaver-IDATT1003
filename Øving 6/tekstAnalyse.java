import java.util.ArrayList;
import java.util.List;

public class tekstAnalyse {

    String tekst;
    List<Integer> antallTegn = new ArrayList<Integer>();
    String resultat;

    public tekstAnalyse(String tekstInput, char valgtBokstav){
        tekst = tekstInput.toLowerCase();
        Character[] bokstaver = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','æ','ø','å'};
        
        for(int l = 0; l<=29 ; l++){
            antallTegn.add(l, 0);
        }

        for(int i = 0; i < tekst.length(); i++){
            char tegn = tekst.charAt(i);
            boolean erBokstav = false;
            for(int j = 0; j < bokstaver.length; j++){

                if(tegn == bokstaver[j]){
                    antallTegn.set(j, antallTegn.get(j)+1);
                    erBokstav = true;
                }
            }
            if(erBokstav == false){
                antallTegn.set(29, antallTegn.get(29)+1);
            }
        }

        int brukteBokstaver = 0;
        int antallBokstaver = 0;
        int antallValgtBokstav = 0;
        int flestForekomster = 0;
        String flestForekomsterBokstav = "";
        for(int k = 0; k < antallTegn.size()-1; k++){
            if(antallTegn.get(k) != 0){
                brukteBokstaver = brukteBokstaver + 1;
                antallBokstaver = antallBokstaver + antallTegn.get(k);
            }

            if(valgtBokstav == bokstaver[k]){
                antallValgtBokstav = antallTegn.get(k);
            }
            if(antallTegn.get(k) > flestForekomster){
                flestForekomster = antallTegn.get(k);
                flestForekomsterBokstav = Character.toString(bokstaver[k]);
            }
            else if(antallTegn.get(k) == flestForekomster){
                flestForekomsterBokstav = flestForekomsterBokstav + " og "+ bokstaver[k];
            }
        }

        float a = antallTegn.get(29);
        float b = tekst.length();
        float antallIkkeBokstaver = (a/b)*100;

        resultat = String.format("Det er brukt %d forskjellige bokstaver i teksten\nDet er totalt %d bokstaver i teksten\nDet er %.2f prosent av teksten som ikke er bokstaver\nBokstaven %c dukker opp %d ganger i teksten\n%s dukker opp flest ganger i teksten", brukteBokstaver, antallBokstaver, antallIkkeBokstaver, valgtBokstav, antallValgtBokstav, flestForekomsterBokstav);
        
    }

    
    public static void main(String[]args){

        tekstAnalyse test = new tekstAnalyse("morsom frokost du hadde idag", 'b');
        System.out.println(test.resultat);

    }
}
