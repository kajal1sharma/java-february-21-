import java.io.*;
public class filereader {
   public static void main(String[] args) throws IOException {
       File f=new File("task");
       FileReader f2=new FileReader(f);

       FileReader f3=new FileReader("task");

            int character=f3.read();
            while(character != -1){
            System.out.print((char)character);
                character=f3.read();
        }

   } 
}
