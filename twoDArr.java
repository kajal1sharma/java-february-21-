import java.util.Scanner;
public class twoDArr {
    //1-D key and search this key in the array
    //2-D same
    //minimum value 1-D
    //maximum value in 2-D
    //minimum value in 2-D
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
