package LInearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][] arr={
                {84,23,21},
                {89,45,67,77,88},
                {56,57},
                {14,47,48,15}
        };
        int target=15;
        System.out.println(Arrays.toString(search(arr,target)));
        System.out.println(max_ele(arr));
        System.out.println(min_ele(arr));
    }

    static int [] search(int [] [] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]==target){
                    return new int []{row,col};
                }
            }
        }
        return new int []{-1,-1};
    }
    static int max_ele(int [][] arr ){
        if(arr.length==0){
            return -1;
        }
        int max=0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]>max){
                    max=arr[row][col];
                }
            }
        }
        return max;
    }
    static int min_ele(int [][] arr ){
        if(arr.length==0){
            return -1;
        }
        int min=arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]<min){
                    min=arr[row][col];
                }
            }
        }
        return min;
    }
}
