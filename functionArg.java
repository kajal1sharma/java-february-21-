public class functionArg {
    public static void chef(int plate){
        plate=plate-20;
        System.out.println(plate);

    }
    public static void chef(int arr[]){
        // plate=plate-20;
        // System.out.println(plate);
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        
        }
        System.out.println(sum);
    }

    public static int cos(int degree){
        int arrcos[]={0,1,2,2,2};
        if(degree==0){
            return arrcos[0];
        }
        else if(degree==30){
            return arrcos[1];
        }
        else if(degree==45){
            return arrcos[2];
        }
        else if(degree==60){
            return arrcos[3];
        }
        return 0;
    }
    public static int sin(int degree){
        int arrcos[]={1,2,4,45,5};
        if(degree==0){
            return arrcos[0];
        }
        else if(degree==30){
            return arrcos[1];
        }
        else if(degree==45){
            return arrcos[2];
        }
        else if(degree==60){
            return arrcos[3];
        }
        return 0;
    }
    public static void main(String[] args) {
        int ingredients=90;
        chef(ingredients);
        int arr[]=new int[]{1,2,3,4,5};

        // chef(arr);
        int value=cos(0)+sin(30);
        System.out.println(value);
    }   
}
