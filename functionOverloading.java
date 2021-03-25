class Calculator{
    // public void add(int a,int b){
    //     int c=a+b;
    //     System.out.println(c);
    // }
    // public void addfloat(float a,float b){
    //     float c=a+b;
    //     System.out.println(c);
    // }

    // public void adddouble(double a,double b){
    //     double c=a+b;
    //     System.out.println(c);
    // }

    // public void addstring(String a,String b){
    //     String c=a+b;
    //     System.out.println(c);
    // }
   // sub
   //mult
   //div
   //mod
   //tan 
   //sin

   //cos
   //log
   //root
   //square
   //any many more

//overloaded functions 
        public void add(int ...a){
            System.out.println("var arg  "+( a[0]+a[1]+a[2]));
        }
        public void add(int a, int ...b){
            System.out.println(a+b[0]+b[1]);
        }
        // public void add(int []a){

        // }
//    public void add(int a, int b ,int c){
//     System.out.println(a+b+c);
//    }
   public void add(int a,int b){
        int c=a+b;
        System.out.println(c);
   }
   public void add(float a,float b){
        float c=a+b;
        System.out.println(c);
    }
    public void add(double a,double b){
        double c=a+b;
        System.out.println(c);
    }
    public void add(String a,String b){
        String c=a+b;
        System.out.println(c);
    }
    public void add(int a,float b){
        float c=a+b;
        System.out.println(c);
    }
}

public class functionOverloading {
    public static void main(String[] args) {
        
        Calculator c=new Calculator();
        // c.add(12,14);
        // c.addfloat(23.32f, 3.3f);
        // c.adddouble(2.23,343.3);
        // c.addstring("wsd","sdadads");
        c.add(12,14);
        c.add(23.32f, 3.3f);
        c.add(2.23,343.3);
        c.add("wsd","sdadads");
        c.add(1,2,3);
        c.add(12,23.2f);
    }
}


// //polymorphism=>overloading=>static binding //compile
// // class Calculator{
// //     private int aaa=90;
// //     public void print(){
// //         System.out.println(this.aaa);
// //     }
// //     public void sum(int a,int b){
// //         int c=a+b;
// //         System.out.println(c);
// //     }
    
// //     Calculator(){

// //     }
// //     Calculator(int aaa){
// //         this.aaa=aaa;
// //     }
// // }

// public class fucntionOverloading {
//     private static int aaa;

//     public static void main(String[] args) {
//         sum(12,13);//if this function would have been static and within this functionoverloading class
//         Calculator c=new Calculator();
//         c.sum(13,132);
//         c.print();  
//         int aaa = c.aaa;    
//     }
// }
