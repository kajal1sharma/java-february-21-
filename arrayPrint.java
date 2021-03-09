public class arrayPrint {
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4};
        int arr2[]={34,2,3,3,3,34,34,3};
        int arr3[]={4,3,4,3,3,3,3,3};
        int arr4[]={4,5,2,4,3,3,2,3,4,5};
        int arr5[][]=new int[][]{{1,2,3}};
        printarr(arr1);
        

        System.out.print("hello world");

        printarr(arr2);
        printarr(arr3);        
    }
}
