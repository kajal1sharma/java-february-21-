public class positiveArr {
    public static void main(String []args){
        int arr[]={12,-23,3423,54,-5,4,45,-45,-90,34,34};
        //positive and negative numbers count

        int counterpos=0;
        int counterneg=0;
        int even=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                counterpos++;
            }
            else if(arr[i]<0){
                counterneg++;
            }
            else{

            }
            

        }

        System.out.println("total positive numbers ::  "+counterpos+"\ntotal negative numbers::  "+counterneg);
    }
}
