//implements Runnable 
//extends Thread

class Mythread1 extends Thread
{
    //thread class provide us with run method
    
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("in thread 1");
        }
    }
   
}
class Mythread2 extends Thread
{
    //thread class provide us with run method
    
    public void run(){
        // System.out.println(Thread.currentThread().getName());  
        // System.out.println(this.currentThread().getName());    
        // System.out.println("iam a thread 2");

        for(int i=0;i<5;i++){
            System.out.println("in thread 2");
        }
    }
   
}
public class Multithreading{
    public static void main(String []args){
         Mythread1 mt1=new Mythread1();
        Mythread2 mt2=new Mythread2();
    //     mt1.setName("rose");
    //     mt2.setName("lily");
    //    mt1.start();
    //    mt2.start();

  
       //1-10
       mt1.setPriority(7);
       mt1.start();
       mt2.setPriority(2);
       mt2.start();
   //System.out.println(Thread.currentThread().getName());   
   Thread.currentThread().setPriority(1);
for(int i=0;i<5;i++){
    System.out.println("in main");
}
//    System.out.println(Thread.currentThread().getPriority());

    //     System.out.println(mt1.getName());
    //     System.out.println(mt2.getName());
        //System.out.println("iam main thread");
        
    
        
    }
}
