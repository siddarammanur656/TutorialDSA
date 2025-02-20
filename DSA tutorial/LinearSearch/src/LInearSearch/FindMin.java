package LInearSearch;

public class FindMin {
    public static void main(String[] args) {
        int [] arr={8,45,56,23,6,-7};
        System.out.println(min_value(arr));
    }
    //search min element in the given array and return the element
    static int min_value(int [] arr ){
        if (arr.length==0){
            return -1;
        }
        // initially min is equal to array element at index 0 and compare with other element using forloop
        int ans=arr[0];
        //run a for loop
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        //Return the min value in  given aray
        return ans;
    }
}
