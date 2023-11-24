public class Rett {
    
    private String navn;
    private String type;
    private int pris;
    private String oppskrift;

    public Rett(String navn, String type, int pris, String oppskrift){
        this.navn = navn;
        this.type = type;
        this.pris = pris;
        this.oppskrift = oppskrift;
    }

    public String getNavn() {
        return this.navn;
    }

    public String getType() {
        return this.type;
    }

    public int getPris() {
        return this.pris;
    }


    public String getOppskrift() {
        return this.oppskrift;
    }


    @Override
    public String toString() {
        return "{" +
            " navn='" + getNavn() + "'" +
            ", type='" + getType() + "'" +
            ", pris='" + getPris() + "'" +
            ", oppskrift='" + getOppskrift() + "'" +
            "}";
    }

}
