public class Student {
    
    private final String navn;
    private int antOppg;

    public Student(String navn, int antOppg){
        this.navn = navn;
        this.antOppg = antOppg;
    }

    public String getNavn() {
        return this.navn;
    }

    public int getAntOppg() {
        return this.antOppg;
    }

    public void økAntOppg(int økning){
        this.antOppg = this.antOppg + økning;
    }

    public String toString(){
        return ("Navn: "+navn+"\nAntall godkjente oppgaver: "+antOppg);
    }
}
