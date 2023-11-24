import java.util.ArrayList;

public class EiendomsRegister {
    
    //Har valgt ArrayList for det er lettere å bruke når man vil legge til eller fjerne objekter uten en satt størrelse på listen. 
    ArrayList<Eiendom> eiendommer = new ArrayList<Eiendom>();
    
    public EiendomsRegister(ArrayList<Eiendom> eiendommer){
        this.eiendommer = eiendommer;
    }

    //Registrerer ny eiendom i registeret
    public void registrerNyEiendom(Eiendom eiendom){
        eiendommer.add(eiendom);
    }

    //Fjerner en eiendom fra registeret
    public void slettEiendom(Eiendom eiendom){
        eiendommer.remove(eiendom);
    }

    //Returnerer antall eiendommer i registeret
    public int antallEiendommer(){
        return eiendommer.size();
    }

    //Finner en eiendom basert på kommunenummer, gårdsnummer og bruksnummer
    public Eiendom finnEiendom(int kommunenr, int gnr, int bnr){
        Eiendom eiendomMedDetaljer = null;
        for(Eiendom eiendom : eiendommer){
            if(eiendom.getKommunenummer() == kommunenr){
                if(eiendom.getGnr() == gnr){
                    if(eiendom.getBnr() == bnr){
                        eiendomMedDetaljer=eiendom;
                    }
                }  
            }  
        }
        return eiendomMedDetaljer;
    }

    //Returnerer gjennomsnittsarealet av alle eiendommene i registeret
    public double gjennomsnittsAreal(){
        double totalAreal = 0;
        for(Eiendom eiendom : eiendommer){
            totalAreal = totalAreal + eiendom.getAreal();
        }
        return totalAreal/eiendommer.size();
    }

    //Returnerer alle eiendommer med et gitt gårdsnummer som en ArrayListe
    public ArrayList<Eiendom> eiendommerMedGnr(int gnr){
        ArrayList<Eiendom> riktigGnr = new ArrayList<Eiendom>();
        for(Eiendom eiendom : eiendommer){
            if(eiendom.getGnr()==gnr){
                riktigGnr.add(eiendom);
            }
        }
        return riktigGnr;
    }

    //Returnerer alle eiendommer i registeret
    public ArrayList<Eiendom> getEiendommer(){
        return eiendommer;
    }




}
