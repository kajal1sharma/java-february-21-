class bubble{

    public static void main(String []args){
        int arr[]={12,4,89,45,11,2,1};
        int n=arr.length;//7

        //cycles
        for(int cycle=0;cycle<n-1;cycle++){

            //comparisions
            for(int i=0;i<n-1;i++){
                if(arr[i]>arr[i+1]){
                    //swapping
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
    }



    for(int i=0;i<n;i++){
        System.out.println(arr[i]+"  ");
    }

    }
}