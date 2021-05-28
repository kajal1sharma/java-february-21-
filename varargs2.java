public class varargs2 {
    public static void print(int a,int ...args){
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
    public static void print2(int ...args){
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
    // public static void print(int arr[]){
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    // }
	
	public static void main(String[] args) {
	    print2(5,8,8,9);
	//print(12,new int[]{4,5,6});
// 	int arr[]={4,6,8,9};
// 	print(arr);
	}
}
