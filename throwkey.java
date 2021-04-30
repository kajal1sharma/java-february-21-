public class throwkey {
    public static void main(String[] args) {
        try{
            int a=0;
            if(a==0){
                a=90;
            }
            else{
                Exception e=new Exception("exception has arised");
                throw(e);
            }
        }
        catch(Exception  e){
            System.out.println(e);
        }
        finally{
            System.out.println("this is finally");
        }
    }
}
