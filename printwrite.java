import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class printwrite {
 public static void main(String[] args) throws IOException {
    FileWriter f=new FileWriter("task"); 
    PrintWriter p=new PrintWriter(new BufferedWriter(f));
    boolean b=true; 
    p.write(97);
     p.print(97);
     p.print(b);
    // p.
     p.close();
 }   
}
