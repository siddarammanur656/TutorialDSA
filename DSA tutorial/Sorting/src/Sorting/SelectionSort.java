package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr={5,2,4,1,3};
        Selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Selectionsort(int [] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int last = arr.length-i-1;
            int maxIndex=GetMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    static void swap(int [] arr , int maxIndex, int last  ){
        int temp=arr[maxIndex];
        arr[maxIndex]=arr[last];
        arr[last]=temp;
    }
    static int GetMaxIndex(int [] arr, int start, int end){
        int max=start;
        for (int i = 0; i <=end; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
