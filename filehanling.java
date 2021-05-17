import java.io.File;
import java.io.IOException;
public class filehanling {
    public static void main(String[] args) throws IOException{
        File f=new File("classes.java");
        File f1=new File("animal");
        f1.delete();
        
        long len=f.length();
        System.out.println(len);
        // String s[]=f1.list();

        // for(int i=0;i<s.length;i++){
        //     System.out.println(s[i]);
        // }
        // System.out.println(f1.isDirectory());
        // System.out.println(f.isFile());
    //    System.out.println( f1.mkdir());
        // File f2=new File(f1,"demo2.txt");
        // f2.createNewFile();

        // File f2=new File("animal/abc","demo.txt");
        // f2.createNewFile();
        //System.out.println(f1.exists());
        //f1.createNewFile();
        //this is not creating new file
        // System.out.println(f1.exists());
        // f.createNewFile();
        // System.out.println(f.exists());

    }
}
