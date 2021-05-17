import java.io.File;
import java.io.IOException;
public class filehanling {
    public static void main(String[] args) throws IOException{
        File f=new File("javademo.txt");
        File f1=new File("animal/abc");
        f1.mkdir();
        File f2=new File(f1,"demo2.txt");
        f2.createNewFile();
        // File f2=new File("animal/abc","demo.txt");
        // f2.createNewFile();
        //System.out.println(f1.exists());
        //f1.createNewFile();
        //this is not creating new file
         System.out.println(f1.exists());
        // f.createNewFile();
        // System.out.println(f.exists());

    }
}
