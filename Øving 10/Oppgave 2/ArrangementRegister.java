import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArrangementRegister {

    private ArrayList<Arrangement> arrangementer = new ArrayList<Arrangement>();

    public ArrangementRegister(ArrayList<Arrangement> arrangementer){
        for(int i=0; i<arrangementer.size(); i++){
            this.arrangementer.add(arrangementer.get(i));
        }
    }


    public ArrayList<Arrangement> arrangementPåSted(String sted){
        ArrayList<Arrangement> arrangementerPåStedet = new ArrayList<Arrangement>();
        for(int i=0; i<arrangementer.size(); i++){
            if(arrangementer.get(i).getSted().equals(sted)){
                arrangementerPåStedet.add(arrangementer.get(i));
            }
        }
        return arrangementerPåStedet;
    }


    public ArrayList<Arrangement> arrangementPåDato(long dato){
        ArrayList<Arrangement> arragementerPåDatoen = new ArrayList<Arrangement>();
        for(Arrangement arr : arrangementer){
            if(arr.getDato() == dato){
                arragementerPåDatoen.add(arr);
            }
        }
        return arragementerPåDatoen;
    }


    public ArrayList<Arrangement> arrangementAvType(String type){
        ArrayList<Arrangement> arrangementAvType = new ArrayList<Arrangement>();
        for(int i=0; i<arrangementer.size(); i++){
            if(arrangementer.get(i).getType().equals(type)){
                arrangementAvType.add(arrangementer.get(i));
            }
        }
        return arrangementAvType;
    }


    public ArrayList<Arrangement> arrangementTidsintervall(int startDato, int sluttDato){
        ArrayList<Arrangement> mellomIntervall = new ArrayList<Arrangement>();
        for(Arrangement arr : arrangementer){
            if(arr.getDato() >= startDato && arr.getDato() <= sluttDato){
                mellomIntervall.add(arr);
            }
        }
        return mellomIntervall;
    }


    public ArrayList<Arrangement> arrangementerSortert(){
        ArrayList<Arrangement> sortertListe = new ArrayList<Arrangement>(arrangementer);
        sortertListe.sort(Comparator.comparing(Arrangement::getSted).thenComparing(Arrangement::getType).thenComparing(Arrangement::getKlokkeslett));

        return sortertListe;
    }
    
}
