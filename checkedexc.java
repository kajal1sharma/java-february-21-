import java.io.PrintWriter;
public class checkedexc {
 public static void main(String[] args) {
     try{
     PrintWriter p=new PrintWriter("aweasdfg.java");
     p.println("hello world");
     }
     catch(Exception e){
        System.out.println(e);
     }
 }   
}
