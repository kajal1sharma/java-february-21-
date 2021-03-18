class Person{
    //variable initialize
    int height=30;
    int weight=2;
    int age;
    String name;

    Person(){
        System.out.println(this.height);
    }
    Person(int height,int weight,String name){
       // System.out.println(this.height);
        this.height=height;
        this.weight=weight;
        this.name=name;
    }
    Person(int height,int weight){
        this.height=height;
        this.weight=weight;
    }
}

public class constructors {
    //null reference and multiple referrences for single object memory representation in heap
    public static void main(String[] args) {
 
        // Person p=new Person();
        // p.height=35;
        // p.weight=2;

        Person p2=new Person(35,3,"teena");

        // Person p2=p;
        //null means a particular reference is not pointing any object
        // p=null;
        // p2=null;



       // System.out.println(p.height);
    }
}
