
class Animal{

int legs;
int eyes ;
int stomach;

    public void canrun(){
        System.out.println("i can run ");
    }
}

class Turtle extends Animal {
    public void canrun(){
        System.out.println("i can walk");
    }

    // public void canwalk(){
    //     System.out.println("i can walk");
    // }
}

public class Overriding {
    public static void main(String[] args) {
        Animal a=new Animal();
        a.canrun();

        Turtle t=new Turtle();
        t.canrun();

        Animal a2=new Turtle();//parent class can always refer to a child class vice versa is not true
        //function dynamic binding
        a2.canrun();
       // t.canwalk();

       //Turtle t2=new Animal();
    }
   

}
