
class myThread extends Thread{
    public void run(){
       // Thread.yield();
        for(int i=0;i<5;i++){
             // Thread.yield();
             
            System.out.println("iam a child thread");
            try{

             Thread.sleep(2000);
             }
             catch(InterruptedException e){
                 
             }
        }
    }
}
class myThread2 extends Thread{
    public void run(){
       // Thread.yield();
        for(int i=0;i<5;i++){
             // Thread.yield();
             
            System.out.println("iam a child thread 2");
            try{

             Thread.sleep(2000);
             }
             catch(InterruptedException e){
                 
             }
        }
    }
}
public class sleepjava
{
	public static void main(String[] args) {
	    
	    myThread m=new myThread();
	    m.start();
	    myThread2 m2=new myThread2();
	    m2.start();
	   // try{
	   // m.join();
	   // }
	   // catch(InterruptedException e){
	        
	   // }
		for(int i=0;i<5;i++){
            
            System.out.println("iam a main thread");
        }
	}
}
