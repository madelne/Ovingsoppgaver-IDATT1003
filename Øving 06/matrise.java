import java.util.Arrays;

public class matrise {

    public final int[][] tabell;
    public int[][] regneTabell;

    public matrise(int[][] t){
        tabell = t;
        regneTabell = new int[tabell.length][tabell[0].length];
        for(int i=0; i<tabell.length; i++){
            for(int j=0; j<tabell[i].length; j++){
                regneTabell[i][j] = tabell[i][j];
            }
        }
    }

    public int getVerdi(int rad, int kollonne){
        return tabell[rad][kollonne];
    }

    public int[][] addereMatrise(int[][] matrise){
        if(matrise.length != tabell.length){
            return null;
        }
        if(matrise[0].length != tabell[0].length){
            return null;
        }
        for(int i=0; i<matrise.length; i++){
            for(int j=0; j<matrise[0].length; j++){
                regneTabell[i][j] = getVerdi(i, j) + matrise[i][j];
            }
        }
        return regneTabell;
    }

    public int[][] multiplisereMatrise(int[][] matrise){
        if(tabell[0].length != matrise.length){
            return null;
        }
        if(tabell[0].length != matrise[0].length){
            for(int s=0; s<tabell.length; s++){
                for(int h=matrise[0].length; h<tabell[0].length; h++){
                    regneTabell[s][h] = 0;
                }
            }
        }
        
        for(int i=0; i<matrise.length; i++){
            for(int j=0; j<matrise[0].length; j++){
                int tall = 0;
                for(int k=0; k<matrise.length; k++){
                    tall = tall + tabell[i][k]*matrise[k][j];
                }
                regneTabell[i][j] = tall;
            }
        }
        return regneTabell;
    }

    public int[][] transponerMatrise(){
        int[][] nyTabell = new int[tabell[0].length][tabell.length];
        for(int i=0; i<tabell.length; i++){
            for(int j=0; j<tabell[i].length; j++){
                nyTabell[j][i] = tabell[i][j];
            }
        }
        return nyTabell;
    }


    public static void main(String[]args){
        int[][] t = {{1, 2, 3}, {4, 5, 6}, {7, 7, 7}};
        matrise testMatrise = new matrise(t);
        int[][] m = {{1, 1, 1}, {1, 1, 1}, {3, 3, 3}};

        int[][] test1 = testMatrise.multiplisereMatrise(m);
        System.out.println(Arrays.deepToString(test1));
    }
    
}
