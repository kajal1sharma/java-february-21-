class Outer {
    int data=90;

    //  static class Inner{
    //        static int gates=4;
    //     }

    //nested class
    // class Inner{
    //     int gates=4;
       
    // }

    public void makeclass(){
        class inner{
            int a=90;

        }
        inner i=new inner();
        System.out.println(i.a);
    }
    
}

public class Run{
    public static void main(String[] args) {
        Outer out=new Outer();
        out.makeclass();
       //inner non static member static =>not possible

        //inner and outer were static
       
        // Outer.Inner i=new Outer.Inner();
        // System.out.println(i.gates);
        //inner outer and gates all were static
        //System.out.println(Outer.Inner.gates);

        //none was static
        // Outer out=new Outer();
        // Outer.Inner in=out.new Inner();  
        // System.out.println(in.gates+" "+out.data+" ");      
    }
}

