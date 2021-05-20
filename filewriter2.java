import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class filewriter2 {
  public static void main(String[] args) throws IOException {
      
        FileWriter f=new FileWriter("task2",false);

        for(int i=0;i<10;i++){
            f.write("dfghjkl");
        }

        f.flush();
        f.close();


  }  
}
