public class exceptionhandling2 {
public static void main(String[] args) {

    //file 1 abc.txt=>char count
    //file2 bcd.txt =>char count
    System.out.println("first");
    System.out.println("second");
    try{
    
    try{
        int a=90/0;//af
    }
    catch(NullPointerException a){

    }
    }catch(NullPointerException a){
        System.out.println(a);
    }
    catch(ArithmeticException a){
        System.out.println(a);
    }
    catch(Exception e){
        System.out.println(e);
    }
    System.out.println("third");
    System.out.println("second22");

}
}


// //exception means =>runtime error
// //default exveption handler
// public class exceptionhandling2 {
//     public static void dofun(){
//        // try{
//             int a=90/0;//exc object
//         // }
//         // catch(Exception e){
//         //         System.out.println("this is handled "+e);
//         // }

//         System.out.println("hello world");
//     }
//     public static void fun(){
//         //try{
//         dofun();
// //         }catch(Exception e){
// // System.out.println(e);
// //         }
//         System.out.println("in fun function");
//     }
//   public static void main(String[] args) {
//     try{  
//     fun();
//     }
//     catch(ArithmeticException e){
//         System.out.println(e);
//     }
//   }  
// }
