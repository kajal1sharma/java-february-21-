import java.util.Scanner;
public class twoDArr {
    public static void main(String []args){
        int arr[]=new int[5];

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<=4;i++){
            arr[i]=sc.nextInt();
        }

        //finding the max value in array

        int max=-9999;

        for(int i=0;i<=4;i++){
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }

        System.out.println("the greatest number is ::  "+max);
    }
}
