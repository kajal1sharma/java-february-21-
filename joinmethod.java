
class myThread extends Thread{
    public void run(){
       // Thread.yield();
        for(int i=0;i<5;i++){
             // Thread.yield();
             
            System.out.println("iam a child thread");
            try{

             Thread.sleep(2000);
             }
             catch(Exception e){
                 
             }
        }
    }
}
public class joinmethod
{
	public static void main(String[] args) {
	    
	    myThread m=new myThread();
	    m.start();
	    try{
	    m.join();
	    }
	    catch(Exception e){
	        
	    }
		for(int i=0;i<5;i++){
            
            System.out.println("iam a main thread");
        }
	}
}
