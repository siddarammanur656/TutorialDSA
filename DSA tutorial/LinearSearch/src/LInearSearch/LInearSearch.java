package LInearSearch;

public class LInearSearch {
    public static void main(String[] args) {
        int [] arr ={8,35,5,6,2,67};
        int target=8;
        System.out.println(Linear_Search3(arr,target));
    }
    //Search the target and return the true or false
    static  boolean Linear_Search(int [] arr , int target){
        if(arr.length==0){
            return false;
        }
        //run a for loop
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==target){
                return true;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return false;
    }
    //Search the target and return the index if item is found
    //otherwiise if not found return -1
    static  int Linear_Search1(int [] arr , int target){
        if(arr.length==0){
            return -1;
        }
        //run a for loop
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==target){
                return i;// i means index of the target element
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }
    //Search the target and return the Element
    static  int Linear_Search3(int [] arr , int target){
        if(arr.length==0){
            return -1;
        }
        //run a for loop
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==target){
                return arr[i];
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return Integer.MAX_VALUE;
    }
}
