package animal2.animal3.animal4;
import vehicle.Vehicle;
 public class Bike  extends Vehicle{
    public int a=10;
    int getter(){
      //  return this.color;
      return 0;
    }

}

class caller{
    public static void main(String[] args) {
        Bike b=new Bike();
        System.out.println(b.getter());
       //System.out.println(b.color);
        // Vehicle v=new Vehicle();
        // System.out.println(v.color);
    }
}
