
abstract class Animals{

    int legs;
    int stomach;

    abstract void eat();
}


abstract class herbivorous extends Animals{
   abstract void eat();
}

class plant extends herbivorous{
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
        frog f=new frog();
        f.eat();
        plant p=new plant();
        p.eat();               
    }
}
