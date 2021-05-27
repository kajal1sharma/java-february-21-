import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bufferedread {
    public static void main(String[] args) throws IOException {
    BufferedReader b=new BufferedReader(new FileReader("task"));
    String str= b.readLine();
    while(str!=null){
       
        System.out.println(str);
        str= b.readLine();
    }
        // int a=b.read();
        // System.out.println((char)a);

        b.close();
    }

}
