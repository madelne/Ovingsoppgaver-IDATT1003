import java.util.ArrayList;

public class MenyRegister {
    
    private ArrayList<Meny> menyer = new ArrayList<Meny>();
    
    public MenyRegister(Meny[] menyer){
        for(Meny meny : menyer){
            this.menyer.add(meny);
        }
    }

    public void nyRett(String navn, String type, int pris, String oppskrift){
        new Rett(navn, type, pris, oppskrift);
    }
    
    public Rett finnRett(String navn){
        Rett riktigRett = null;
        for(Meny meny : menyer){
            for(Rett rett : meny.getRetter()){
                if(rett.getNavn().equals(navn)){
                    riktigRett = rett;
                }
            }
        }
        return riktigRett;
    }

    public ArrayList<Rett> retterAvType(String type){
        ArrayList<Rett> retterAvType = new ArrayList<Rett>();
        for(Meny meny : menyer){
            for(Rett rett : meny.getRetter()){
                if(rett.getType().equals(type)){
                    if(retterAvType.contains(rett) == false){
                        retterAvType.add(rett);
                    }
                }
            }
        }
        return retterAvType;
    }

    public void nyMeny(String navn, ArrayList<Rett> retter){
        new Meny(navn, retter);
    }

    public ArrayList<Meny> totalPrisIIntervall(int minPris, int maxPris){
        ArrayList<Meny> totalPrisInnenfor = new ArrayList<Meny>();
        for(Meny meny : menyer){
            if(meny.getTotalPris()>=minPris && meny.getTotalPris()<=maxPris){
                totalPrisInnenfor.add(meny);
            }
        }
        return totalPrisInnenfor;
    }
}
