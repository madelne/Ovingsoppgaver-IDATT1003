public class Eiendom {
    
    int kommunenummer;
    String kommunenavn;
    int gnr;
    int bnr;
    String bruksnavn;
    double areal;
    String eierNavn;

    public Eiendom(int kommunenummer, String kommunenavn, int gnr, int bnr, String bruksnavn, double areal, String eierNavn) {
        this.kommunenummer = kommunenummer;
        this.kommunenavn = kommunenavn;
        this.gnr = gnr;
        this.bnr = bnr;
        this.bruksnavn = bruksnavn;
        this.areal = areal;
        this.eierNavn = eierNavn;
    }

    public Eiendom(int kommunenummer, String kommunenavn, int gnr, int bnr, double areal, String eierNavn) {
        this.kommunenummer = kommunenummer;
        this.kommunenavn = kommunenavn;
        this.gnr = gnr;
        this.bnr = bnr;
        this.bruksnavn = null;
        this.areal = areal;
        this.eierNavn = eierNavn;
    }
    

    //Returnerer kommunenummeret
    public int getKommunenummer() {
        return this.kommunenummer;
    }

    //Returnerer kommunenavnet
    public String getKommunenavn() {
        return this.kommunenavn;
    }

    //Returnerer gårdsnummeret
    public int getGnr() {
        return this.gnr;
    }

    //Returnerer bruksnummeret
    public int getBnr() {
        return this.bnr;
    }

    //Returnerer bruksnavnet
    public String getBruksnavn() {
        return this.bruksnavn;
    }

    //Returnerer arealet i m^2
    public double getAreal() {
        return this.areal;
    }

    //Returnerer eierens navn
    public String getEierNavn() {
        return this.eierNavn;
    }

    //Hvis eiendommen selges
    public void setEierNavn(String eierNavn) {
        this.eierNavn = eierNavn;
    }

    //Returnerer stringen i formatet kommunenummer-gårdsnummer/bruksnummer
    public String toString(){
        return kommunenummer+"-"+gnr+"/"+bnr;
    }

}
