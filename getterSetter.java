class car{
    private int color=5;
    private int height;
    private int wheels;

    public void setcolor(int color)
    {
        if(color<10 && color>0)
        this.color=color;
        else{

        }
    }
    public int getcolor(){
        return this.color;
    }
    public void setwheel(int wheel){
//logic 
    }

}
public class getterSetter {
   public static void main(String[] args) {
       car c=new car();
    //    c.color=89;
    //    c.color=0;
    c.setcolor(4);
    System.out.println(c.getcolor());
   } 
}
