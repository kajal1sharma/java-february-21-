class Mobile{
    int height=12;
    int width=6;
    int weight=200;
    String color="black";
    Mobile(){
        //empty 
    }
    //parameterized constr
    Mobile(int height,int width){
        this.height=height;
        this.width=width;
    }
    Mobile(int height,int width,int weight){
        this.height=height;
        this.width=width;
        this.weight=weight;
        
    }
}




public class constructors{
public static void main(String[] args) {
    
    Mobile m1=new Mobile();
    Mobile m2=new Mobile(12,7);
    Mobile m3=new Mobile(13,6,35);
    //any variable that has the capapbility of holding address is known as a reference variable;
    m1.height=23;
    m2.weight=34;
    m1=null;
    m2=null;
    m1=new Mobile();
    //a reference variable when holds a null value => does not point to any object
    int a=90;
    int b =a;
    a=89;
    int c=89;

}
}

































// class Person{
//     //variable initialize
//     int height=30;
//     int weight=2;
//     int age;
//     String name;

//     Person(){
//         System.out.println(this.height);
//     }
//     Person(int height,int weight,String name){
//        // System.out.println(this.height);
//         this.height=height;
//         this.weight=weight;
//         this.name=name;
//     }
//     Person(int height,int weight){
//         this.height=height;
//         this.weight=weight;
//     }
// }

// public class constructors {
//     //null reference and multiple referrences for single object memory representation in heap
//     public static void main(String[] args) {
 
//         // Person p=new Person();
//         // p.height=35;
//         // p.weight=2;

//         Person p2=new Person(35,3,"teena");

//         // Person p2=p;
//         //null means a particular reference is not pointing any object
//         // p=null;
//         // p2=null;



//        // System.out.println(p.height);
//     }
// }
