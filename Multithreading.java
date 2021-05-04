//implements Runnable 
//extends Thread

class Mythread1 extends Thread
{
    //thread class provide us with run method
    
    public void run(){
        System.out.println("iam a thread 1");
    }
   
}
class Mythread2 extends Thread
{
    //thread class provide us with run method
    
    public void run(){
        System.out.println("iam a thread 2");
    }
   
}
public class Multithreading{
    public static void main(String []args){
        Mythread1 mt1=new Mythread1();
        Mythread2 mt2=new Mythread2();
        
        mt1.start();
        mt2.start();
        System.out.println("iam main thread");
        
    
        
    }
}
