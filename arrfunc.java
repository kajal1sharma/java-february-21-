public class arrfunc {

    public static void sumarr(int array2[]){
        array2[3]=789;//
    }
    public static void main(String[] args) {
        int arr[]=new int[6];


        arr[0]=12;
        arr[1]=2;
        arr[2]=13;
        arr[3]=4;
        arr[4]=2;
        arr[5]=90;

        sumarr(arr);

    }
}
