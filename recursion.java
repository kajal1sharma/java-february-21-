class recursion{

    public static void print(int n){
        if(n==0)
        {return;}
        System.out.println("print fucntion"+n);
        print(n-1);
    }
    //int a=8967;
// 8 9 6 7
    
    public static void main(String[] args) {
        System.out.println("hello world");
        print(6);
        
        System.out.println("hello world 2");
    }
}