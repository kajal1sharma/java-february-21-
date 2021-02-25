import java.util.Scanner;
public class TwoDimArr {
    public static void main(String []args){
     
        int arr[][]=new int[3][3];
        // arr[0][0]=12;
        // arr[0][1]=122;
        // arr[0][2]=23;
        // arr[1][0]=12;
        // arr[1][1]=122;
        // arr[1][2]=23;
        // arr[2][0]=12;
        // arr[2][1]=122;
        // arr[2][2]=23;

        // for(int i=0;i<=2;i++){//each row
        //     for(int j=0;j<=2;j++){//1-D arrray access
        //         System.out.println(arr[i][j]);
        //     }
        // }
        Scanner sc=new Scanner(System.in);
        int arr2[][]=new int[3][];
        arr2[0]=new int[4];
        arr2[1]=new int[1];
        arr2[2]=new int[2];

        for(int i=0;i<=2;i++){//each row
            for(int j=0;j<arr2[i].length;j++){//1-D arrray access
                arr2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<=2;i++){//each row
            for(int j=0;j<arr2[i].length;j++){//1-D arrray access
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
