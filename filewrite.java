import java.io.*;

public class filewrite {
    public static void main(String[] args) throws IOException {
        
    FileWriter f= new FileWriter("task");

    File f1=new File("task");
    FileWriter f2=new FileWriter(f1);

    FileWriter f3= new FileWriter("task",true);//append =true

    FileWriter f4= new FileWriter("task",false);

    

    }
}
