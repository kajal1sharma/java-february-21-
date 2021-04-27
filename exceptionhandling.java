class Abcs{
   public  int length=0;
   public void run(){

   }
}

public class exceptionhandling {
  public static void main(String[] args) {
//handle exception ,normal flow 
   
try{
    Abcs a=new Abcs();
    a=null;
    a.run(); 
      //int a=89/0;
    }
    catch(Exception obj){
        
        System.out.println(obj);
    }
      System.out.println("hello world");
  }  
}
