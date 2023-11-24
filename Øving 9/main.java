public class main {
    
    public static void main(String[]args){
        Student amanda = new Student("Amanda", 10);
        Student martine = new Student("Martine", 9);
        Student[] testliste = {amanda, martine};
        Oppgaveoversikt test = new Oppgaveoversikt(testliste);

        System.out.println(test.getAntStud());
        System.out.println(amanda.getAntOppg());
        amanda.økAntOppg(10);
        System.out.println(amanda.getAntOppg());
        System.out.println(amanda.toString());


        
        
    }
}
