import java.util.Scanner;

public class vararguserinput {
    public static void print(int ...vr){
        for(int i=0;i<vr.length;i++){
            System.out.println(vr[i]);
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        print(arr);
    }
}
