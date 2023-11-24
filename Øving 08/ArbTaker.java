public class ArbTaker {
    java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();

    public int år = kalender.get(java.util.Calendar.YEAR);
    public Person personalia;
    public int arbtakernr;
    public int ansettelsesår;
    public double månedslønn;
    public double skatteprosent;

    public ArbTaker(Person personalia, int arbtakernr, int ansettelsesår, double månedslønn, double skatteprosent){
        this.arbtakernr = arbtakernr;
        this.ansettelsesår = ansettelsesår;
        this.månedslønn = månedslønn;
        this.skatteprosent = skatteprosent;
        this.personalia = personalia;
    }

    public int getArbtakernr(){
        return this.arbtakernr;
    }

    public int getAnsettelsesår(){
        return this.ansettelsesår;
    }

    public double getMånedslønn(){
        return this.månedslønn;
    }

    public double getSkatteprosent(){
        return this.skatteprosent;
    }

    public void setMåndeslønn(double nyLønn){
        this.månedslønn = nyLønn;
    }

    public void setSkatteprosent(double nyProsent){
        this.skatteprosent = nyProsent;
    }

    public double skattPerMåned(){
        return this.månedslønn*this.skatteprosent;
    }

    public double bruttoÅrslønn(){
        return this.månedslønn*12;
    }

    public double skattPerÅr(){
        return this.månedslønn*10*skatteprosent+this.månedslønn*this.skatteprosent*0.5;
    }

    public String navn(){
        return personalia.etternavn+","+personalia.fornavn;
    }

    public int alder(){
        return år-personalia.fødselsår;
    }

    public int årIBedriften(){
        return år-this.ansettelsesår;
    }

    public boolean ansattOverGittÅr(int parameter){
        return år-ansettelsesår>=parameter;
    }



    
}
