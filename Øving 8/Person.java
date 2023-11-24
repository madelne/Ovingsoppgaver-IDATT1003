public class Person {

    public final String fornavn;
    public final String etternavn;
    public final int fødselsår;

    public Person(String fornavn, String etternavn, int fødselsår){
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.fødselsår = fødselsår;

    }

    public String getFornavn(){
        return this.fornavn;
    }

    public String getEtternavn(){
        return this.etternavn;
    }

    public int getFødselsår(){
        return this.fødselsår;
    }

    
}
