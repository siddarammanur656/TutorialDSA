package Sorting;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int [] arr ={3,5,2,1,4};
        Cyclesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Cyclesort(int[] arr){
        int i=0;
        while(i<arr.length){
            int currect=arr[i]-1;
            if(arr[i]!=arr[currect]){
                swap(arr,i,currect);
            }else{
                i++;
            }
        }
    }
    static void  swap(int [] arr ,int first, int second){
            int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
