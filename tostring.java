import animal2.animal3.animal4.Bike;
class Cars{
    int a=90;

    public String toString(){
        return "cars"+"a="+this.a;
    }

}

public class tostring {
    public static void main(String[] args) {
        Cars c=new Cars();
        Cars c2=new Cars();
        Bike a=new Bike();
        System.out.println(c.toString()+"  "+a.toString());
    }
}
