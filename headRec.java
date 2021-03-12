public class headRec {
//1 2 3 4 5
    public static void print(int n){
        if(n==0)
        {
            return;
        }
        // System.out.println(n);
        // print(n-1);//tail recursion
        print(n-1);
        System.out.println(n);
       return;
    }
    public static void main(String[] args) {
        print(5);
        System.out.println("hello");
    }
}
