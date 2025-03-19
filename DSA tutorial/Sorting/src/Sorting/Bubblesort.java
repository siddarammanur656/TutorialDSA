package Sorting;
//bubble sort problem
import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        //Creating array
        int [] arr={3,1,5,4,2};
        //calling method
        Bubble(arr);
        //displaying sorted array
        System.out.println(Arrays.toString(arr));
    }
    //creating method Bubble to sort element in array
    static void Bubble(int [] arr){
        boolean swapped;
        //run the step n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped=false;
            //for each step , max value comes at the last respective index
            for (int j = 1; j < arr.length-i; j++) {
                //swap the element if the element smaller than previous item
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp= arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            // if you did not swap for a perticular value of i, it means array is sorted and stop the program
            if(!swapped){
                break;
            }
        }
    }
}
