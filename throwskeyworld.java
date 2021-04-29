public class throwskeyworld {
    static void printagain() throws ArithmeticException{
        int a=9/0;
    }
    static void print(){
        printagain();


    }
    public static void main(String[] args) {
        print();
    }
}
