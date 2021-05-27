import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class filebuffwr {
    public static void main(String[] args) throws IOException {
        FileWriter f=new FileWriter("task",true);
        BufferedWriter b=new BufferedWriter(f);
       // BufferedWriter b2=new BufferedWriter(new FileWriter("task"));
        b.write("sdfghjklo");
        b.newLine();
        b.write(97);
        b.flush();
        b.close();
    }
}
