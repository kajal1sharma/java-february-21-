//immutable objects final class
final class Payment{
    int amount;
    
    public void makepayment(){
        System.out.println("the payment will be made from here");
    }
}

// class cash extends Payment{

// }
public class Finalclass {
    public static void main(String[] args) {
        Payment pt=new Payment();
        pt.makepayment();
    }
}
