public class Arrangement {
    
    private int nummer;
    private String navn;
    private String sted;
    private String arrangør;
    private String type;
    private long tidspunkt;

    public Arrangement(int nummer, String navn, String sted, String arrangør, String type, long tidspunkt) {
        this.nummer = nummer;
        this.navn = navn;
        this.sted = sted;
        this.arrangør = arrangør;
        this.type = type;
        this.tidspunkt = tidspunkt;

    }


    public int getNummer() {
        return this.nummer;
    }


    public String getNavn() {
        return this.navn;
    }


    public String getSted() {
        return this.sted;
    }


    public String getArrangør() {
        return this.arrangør;
    }


    public String getType() {
        return this.type;
    }


    public long getTidspunkt() {
        return this.tidspunkt;
    }


    public int getDato(){
        String tidString = String.valueOf(tidspunkt);
        int dato = Integer.valueOf(tidString.substring(0, 8));
        return dato;
    }

    public int getKlokkeslett(){
        String tidString = String.valueOf(tidspunkt);
        int klokkeslett = Integer.valueOf(tidString.substring(8, 12));
        return klokkeslett;
    }


    public String toString(){
        return "Nummer: "+nummer+
        ", Navn: "+navn+
        ", Sted: "+sted+
        ", Arrangør: "+arrangør+
        ", Type: "+type+
        ", Tidspunkt: "+tidspunkt;
    }

}
