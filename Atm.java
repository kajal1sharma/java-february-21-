class Bank{
    private int amount=20000;
    private int accountno;
    Bank(int accountno){
        this.accountno=accountno;
    }
    public void amountwithdrawn(int wit_amount){
        if(this.amount<wit_amount){
            System.out.println("you dont have enough balance"); 
        }
        else{
        this.amount=this.amount-wit_amount;
        System.out.println(this.amount);
        }
    }
    
}
public class Atm {
    public static void main(String[] args) {
        Bank reena=new Bank(122343434);
        reena.amountwithdrawn(2000);
       
        // reena.amount=100000;
        // reena.amount=0;

    }
}
