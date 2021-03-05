public class functionintro {
    //indian chef=> printarray
    public static void printArray(int a[]){//script
        for(int i=0;i<a.length;i++){
	        System.out.println(a[i]);
	    }
    }
	public static void main(String[] args) {//main is our head chef
	    int arr[]={1,2,3,4,4};
	    printArray(arr);//calling a function
	    int arr2[]={2,4,4,4,3,2,2};
	     printArray(arr2);
	}
}


// function_name()=>calling a function
