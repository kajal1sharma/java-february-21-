class Teacher{
    static int a;
    int b;
    public void print(){
        System.out.println("hi this is print function");
        print2();//non static can call static function 
    }
    public static void print2(){
        System.out.println("hi this is print2 function==> static ");
        //print(); //you cannot call a non static function from static 
    }
}

public class StaticKeyword{
    

    public static void main(String[] args) {
    Teacher t=new Teacher();    
    t.print();
    t.print2();
    Teacher.print2();
    }
}
