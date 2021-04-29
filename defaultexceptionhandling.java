public class defaultexceptionhandling {

    static void printagain(){
        int a=12/0;
        System.out.println("hello world");
    }
    static void print(){
        try{
        printagain();
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("normal exc");
    }
    public static void main(String[] args) {
        print();
    }
}
