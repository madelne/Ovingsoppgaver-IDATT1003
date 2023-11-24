public class brøkregning {

    int teller;
    int nevner;

    public brøkregning(int teller, int nevner){
        if (nevner == 0){
            throw new IllegalArgumentException("Nevner kan ikke være null");
        }else{
            this.teller = teller;
            this.nevner = nevner;
        }
    }

    public brøkregning(int teller){
        this.teller = teller;
        nevner = 1;
    }

    public int getNevner(){
        return this.nevner;
    }

    public int getTeller(){
        return this.teller;
    }


    void sumBroker(int teller, int nevner){
        if(this.nevner == nevner){
            this.teller = this.teller + teller;
        }
        else{
            teller = teller*this.nevner;
            this.teller = nevner*this.teller + teller;
            this.nevner = nevner*this.nevner;
        }
    }

    void subtraherteBroker(int teller, int nevner){
        if(this.nevner == nevner){
            this.nevner = this.nevner - nevner;
        }
        else{
            teller = teller*this.nevner;
            this.teller = nevner*this.teller;
            this.nevner = nevner*this.nevner;
            this.teller = this.teller - teller;
        }
    }

    void multipliserteBroker(int teller, int nevner){
        this.teller = this.teller*teller;
        this.nevner = this.nevner*nevner;
    }

    void dividerteBroker(int teller, int nevner){
        this.teller = this.teller*nevner;
        this.nevner = this.nevner*teller;
    }

    public static void main(String[]args){
        brøkregning brok = new brøkregning(5, 3);

        brok.sumBroker(4,3);
        System.out.println("5/3 + 4/3 = "+ brok.getTeller() +"/"+brok.getNevner());

        brok.subtraherteBroker(5, 6);
        System.out.println("9/3 - 5/6 = "+brok.getTeller()+"/"+brok.getNevner());

        brok.multipliserteBroker(3, 2);
        System.out.println("(39/18) * (3/2) = "+brok.getTeller()+"/"+brok.getNevner());

        brok.dividerteBroker(5, 7);
        System.out.println("(117/36) / (5/7) = "+brok.getTeller()+"/"+brok.getNevner());
    }
}