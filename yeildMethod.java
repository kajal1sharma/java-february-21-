class myThread extends Thread{
    public void run(){
        Thread.yield();
        for(int i=0;i<1000;i++){
             // Thread.yield();
            System.out.println("iam a child thread");
        }
    }
}
public class yeildMethod
{
	public static void main(String[] args) {
	    
	    myThread m=new myThread();
	    m.start();
		for(int i=0;i<1000;i++){
            
            System.out.println("iam a main thread");
        }
	}
}
