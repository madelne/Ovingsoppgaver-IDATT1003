import java.util.ArrayList;

public class Meny {

    private String navn;
    private ArrayList<Rett> retter = new ArrayList<Rett>();

    public Meny(String navn, ArrayList<Rett> retter){
        this.navn = navn;
        this.retter = retter;
    }

    public String getNavn(){
        return this.navn;
    }

    public ArrayList<Rett> getRetter(){
        return this.retter;
    }

    public int getTotalPris(){
        int pris = 0;
        for(Rett rett : retter){
            pris = pris + rett.getPris();
        }
        return pris;
    }

    @Override
    public String toString() {
        ArrayList<String> rettNavn = new ArrayList<String>();
        for(Rett rett : retter){
            rettNavn.add(rett.getNavn());
        }
        return "{" +
            " navn='" + getNavn() + "'" +
            ", retter='" + rettNavn+ "'" +
            "}";
    }

}
