public class NyString {
    
    public final String tekst;
    public String tekstKopi;
    public String tegn;

    public NyString(String nyTekst, String tegn){
        this.tekst = nyTekst;
        this.tegn = tegn;
        this.tekstKopi = nyTekst;
    }

    public String utenTegn(){
        String tekstUtenTegn = "";
        int a=0;
        while(tekstKopi.indexOf(tegn)!=-1 && tekstKopi.indexOf(tegn)!=0){
            tekstUtenTegn = tekstUtenTegn + tekstKopi.substring(a, tekstKopi.indexOf(tegn));
            a = tekstKopi.indexOf(tegn);
            tekstKopi = tekstKopi.replaceFirst(tegn, "");
        }
        tekstUtenTegn = tekstUtenTegn + tekstKopi.substring(a);
        if(tekstKopi.indexOf(tegn)==0){
            tekstUtenTegn = tekstUtenTegn.replaceAll(tegn, "");
        }
        return tekstUtenTegn;
    }

    public String forkortet(){
        String[] ordListe = tekst.split(" ");
        String tekstForkortet = "";
        for(int i=0; i<ordListe.length; i++){
            String[] bokstav = ordListe[i].split("");
            tekstForkortet = tekstForkortet + bokstav[0];
        }
        return tekstForkortet;
    }

    public static void main(String[]args){
        String testTekst = "hva skal jeg spise til middag idag";
        NyString test1 = new NyString(testTekst, "a");
        
        System.out.println(test1.forkortet());
        System.out.println(test1.utenTegn());

    }

}
