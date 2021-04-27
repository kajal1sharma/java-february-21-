class Abcs{
   public  int length=0;
   public void run(){

   }
}

public class exceptionhandling {
  public static void main(String[] args) {
//handle exception ,normal flow 
   
try{
    int a=25;
    if(a==25){
    Exception e=new Exception("iam an ecxception");
    throw(e);
    }else{
        a=40;
    }
//    int aa=89/0;
    // try{
        
    // }
    // catch(NullPointerException n){

    // }
    // catch(ArithmeticException a){
    //     System.out.println("arithmetic exc");
    // }
    // Abcs a=new Abcs();
    // a=null;
    // a.run(); 
    //   //int a=89/0;
    }
    catch(NullPointerException obj){

        System.out.println("null");
    }
    catch(ArithmeticException obj){

        System.out.println("arith");
    }
    catch(Exception obj){

        System.out.println(obj);
    }
    finally{
        System.out.println("hello in finally");   
    }
      System.out.println("hello world");
  }  
}
