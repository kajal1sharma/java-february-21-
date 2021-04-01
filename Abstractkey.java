//final abstract class Animals{
abstract class Animals{

    private int legs;
    int stomach;
//final abstract  cannot be used together
    //final abstract void eat();
   
   
    // static  abstract void eat();
    // private abstract void eat();
    abstract void eat();

    final void walk(){
        System.out.println("lets walk!!!");
    }
    private static void play(){
        System.out.println("lets play !!!");
    }

    Animals(){
        this.legs=10;
    }

    //abstract Animals();
}


abstract class herbivorous extends Animals{
    herbivorous(){
        super();
    }
   //abstract void eat();
}

class plant extends herbivorous{
    plant(){
        super();
      // this.legs=10;
       this.stomach=90;
    }
    void eat(){
        System.out.println("i eat sunlight and co2");
    }
}

class frog extends herbivorous{
    void eat(){
        System.out.println("i eat palnts and grass");
    }   
}


class carnivorous extends Animals{
    void eat(){
        System.out.println("i eat meat");
    }
}
public class Abstractkey {
    public static void main(String[] args) {
        //Animals a=new Animals();
        //herbivorous h=new herbivorous();
        //h.eat();
        // Animals.play();
        // frog f=new frog();
        // f.eat();
        // plant p=new plant();
        // p.eat();             
        
        plant p=new plant();
        // p.play();

    }
}
