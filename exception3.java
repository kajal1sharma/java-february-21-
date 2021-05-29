import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class redd{
    int a;
}
public class exception3 {
  static int red=0;
    public static void main(String[] args){
       try{
           Scanner sc=new Scanner(System.in);
           int den=sc.nextInt();
           int a=90/den;
           redd r=new redd();
           r=null;
           r.a=9056;

           FileWriter f=new FileWriter("abc.txt");
       }
       catch(ArithmeticException e){
            System.out.println("iam a arithmetic exc");
       }
       catch(NullPointerException e){
           System.out.println("iam a null pointer excep");
       }
       catch(IOException e){
        System.out.println("iam a io excep");
       }
    }
}
