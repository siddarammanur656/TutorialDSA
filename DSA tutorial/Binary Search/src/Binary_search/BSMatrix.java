package Binary_search;

import java.util.Arrays;

public class BSMatrix {
    public static void main(String[] args) {
        int [] [] arr={
                        {1, 3, 5, 7},
                        {10, 11, 16, 20},
                        {23, 30, 34, 60}
                      };
        int target=7;
        System.out.println(Arrays.toString(Search1(arr,target)));
        System.out.println(Arrays.toString(Search2(arr,target)));
        System.out.println(Arrays.toString(BinarySearch(arr,target)));
    }
    static int [] Search1(int [] [] arr , int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]==target){
                    return new int [] {row,col};
                }
            }
        }
        return new int [] {-1,-1};
    }

    static int [] Search2(int [] [] arr, int target){
        if (arr == null || arr.length == 0 || arr[0].length == 0) {
            return new int[]{-1, -1}; // Return (-1, -1) if matrix is empty
        }

        int rows = arr.length;
        int cols = arr[0].length;

        int row = 0, col = cols - 1;  // Start from top-right corner

        while (row < rows && col >= 0) {
            if (arr[row][col] == target) {
                return new int[]{row, col};  // Return index of target
            } else if (arr[row][col] > target) {
                col--;  // Move left
            } else {
                row++;  // Move down
            }
        }

        return new int[]{-1, -1};
    }
    static int [] BinarySearch(int [] [] arr, int target){
        if (arr==null || arr.length==0 || arr[0].length==0 ){
            return new int[]{-1,-1};
        }
        int rows = arr.length, cols = arr[0].length;
        int left = 0;
        int right = rows * cols - 1;

        while(left<=right){
            int mid = left + (right - left) / 2;
            int midValue = arr[mid / cols][mid % cols];

            if (midValue == target) {
                return new int [] {mid / cols, mid % cols};  // Return the 1D index of the found element
            } else if (midValue < target) {
                left = mid + 1;  // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return new int[]{-1,-1};
    }
}
