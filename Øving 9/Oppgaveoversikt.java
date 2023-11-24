import java.util.ArrayList;

public class Oppgaveoversikt {

    private ArrayList<Student> studenter = new ArrayList<Student>();
    private int antStud=0;

    public Oppgaveoversikt(Student[] student){
        for(int i=0; i<student.length; i++){
            studenter.add(student[i]);
            antStud++;
        }
        
    }

    public int getAntStud(){
        return antStud;
    }



}