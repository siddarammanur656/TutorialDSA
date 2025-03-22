package Sorting;

import java.util.Arrays;

public class SelectionSortEx2 {
    public static void main(String[] args) {
        int [] arr={5,2,3,1,4};
        Selectionsort2(arr);
        System.out.println(Arrays.toString(arr));
    }
    //method is to sort the array,Selection sort selecting minIndex
    static void SelectionSort1(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int mini = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            //swap
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
    }
   static void Selectionsort2(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                int last = arr.length - i - 1;
                int max = 0;
                for (int j =0; j <= last; j++) {
                    if (arr[j] > arr[max]) {
                        max = j;
                    }
                }
                int temp = arr[max];
                arr[max] = arr[last];
                arr[last] = temp;
            }
        }
}

