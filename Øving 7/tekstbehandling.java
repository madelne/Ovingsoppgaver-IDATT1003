public class tekstbehandling {

    public String tekst;

    public tekstbehandling(String tekst){
        this.tekst = tekst;
    }

    public int antallOrd(){
        String[] ord = tekst.split(" ");
        return ord.length;
    }

    public int ordLengde(){
        String[] ord = tekst.split(" ");
        int sum = 0;
        for(int i=0; i<ord.length; i++){
            sum = sum + ord[i].length();
        }
        return sum/ord.length;
    }

    public int ordPerPeriode(){
        String[] perioder = tekst.split("[.!:?]");
        String[] ord = tekst.split(" ");
        return ord.length/perioder.length;
    }

    public void skifteOrd(String ord, String erstattning){
        String byttet = tekst.replaceAll(ord, erstattning);
        this.tekst = byttet;
    }

    public String getString(){
        return tekst;
    }

    public String storeBokstaver(){
        return tekst.toUpperCase();
    }

    public static void main(String[]args){

        tekstbehandling nyTekst = new tekstbehandling("hva skal jeg spise. til middag idag?");
        System.out.println(nyTekst.antallOrd());
        System.out.println(nyTekst.ordLengde());
        System.out.println(nyTekst.ordPerPeriode());
        nyTekst.skifteOrd("hva", "ka");
        System.out.println(nyTekst.getString());
        System.out.println(nyTekst.storeBokstaver());

    }
    
}
