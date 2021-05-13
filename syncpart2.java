class common2{
    public synchronized void print(String s){
        for(int i=0;i<3;i++){
            System.out.println(s);
            try{
            Thread.sleep(2000);
            }
            catch(InterruptedException e){
                
            }
        }
    }
     public synchronized void print2(String s){
        for(int i=0;i<3;i++){
            System.out.println(s+"print 2");
            try{
            Thread.sleep(2000);
            }
            catch(InterruptedException e){
                
            }
        }
    }
     public void read(String s){
        for(int i=0;i<3;i++){
            System.out.println("non syn resource");
            try{
            Thread.sleep(2000);
            }
            catch(InterruptedException e){
                
            }
        }
    }
}
class Mythread3 extends Thread{
    //reference 
   public  common2 c;
    public void run(){
    // common c=new common();
     
        c.print("thread 1");
    }
}
public class syncpart2
{
	public static void main(String[] args) {
		Mythread3 m=new Mythread3();
		common2 c2=new common2();
		m.c=c2;
		m.start();
	    c2.read("hjj");
		c2.print2("main");
	}
}
