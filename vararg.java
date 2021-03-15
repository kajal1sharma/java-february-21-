public class vararg {
    public static void printarr(int arr[]){

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }

    public static void sum(int a,int b){
        int sum=a+b;
        System.out.println(sum);
    }
    public static void sum2(int a,int b,int c){
        int sum=a+b+c;
        System.out.println(sum);
    }
    public static void sumvararg(int a,int ...varargument){
        int sum=0;

        for(int i=0;i<varargument.length;i++){
            sum=sum+varargument[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {

        int a=90;
        int b=89;
        sum(a,b);
        int c=67;
        // sum(a,b,c);
        sum2(a,b,c);
        int d=23;
        sumvararg(2,2,2,2,2,3,3,a,b,c,d,4,2);
        sumvararg(2,new int[]{1,2,3,3,44,4,4,4,4});
        sumvararg(2);




        //int arr[]={1,2,3,4,5};
        //int arr[]=new int[]{1,2,3,4,5};
        //int a=9;
        //print(9);
        // printarr(new int[]{1,2,3,4,5});
    }
}
