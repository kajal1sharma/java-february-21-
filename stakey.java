class ABCD{
  static int a=90;
  int b=89;
   static public void print(){
            System.out.print("iam static function"+a);
   } 
   public void changestaticvariable(){
       this.a=this.a+10;
       System.out.println(a);
   }

}
public class stakey {
    public static void main(String[] args) {
        // ABCD.print();
        ABCD obj1=new ABCD();
        ABCD obj2=new ABCD();
        ABCD obj3=new ABCD();
        ABCD.a=80;
        //ABCD.changestaticvariable();
        obj1.changestaticvariable();
        obj2.changestaticvariable();
        obj3.changestaticvariable();
    }
}
