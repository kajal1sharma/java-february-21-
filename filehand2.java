import java.io.*;

//C:\Users\ashis\Documents\javacore10ambatch\filehand2.java
public class filehand2 {
    public static void listfilesindir(File f){
        // File f=new File(ss);
        String s[]=f.list();

        for(int i=0;i<s.length;i++){
            File f2=new File(f,s[i]);
            if(f2.isDirectory()){
                System.out.println(s[i]+"-------");
                listfilesindir(f2);
            }
            else{
                // System.out.println(s[i]);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        //relative path
        //parent directory access
        //File f=new File(".");
        //File f=new File("../../javacore10ambatch");

        //full path 

        File f=new File("C:/Users/ashis/Documents/javacore10ambatch");


        if(f.exists()){
        String s[]=f.list();
        for(int i=0;i<s.length;i++){
            File f2=new File(s[i]);
            if(f2.isDirectory()){
             System.out.println(s[i]+"  ---");
               listfilesindir(f2);

            }
            
        }
    }
        else{
            System.out.println("error occurred while accessing the file");
        }
    }
}
