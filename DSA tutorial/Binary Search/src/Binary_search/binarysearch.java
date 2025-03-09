package Binary_search;

public class binarysearch {
    public static void main(String[] args) {
        //taking input array
        int[] arr = {89,56,23,12,10,5,2};
        //initializing target element to be find the index of the element
        int target = 5;
        //calling the binary_s method to find the index of target element
        System.out.println(binary_s(arr, target));
    }
    //creating method to find the index of then target element
    static int binary_s(int[] arr, int target) {
        //initializing starting index in the array
        int start = 0;
        //initializing last index in the array
        int end = arr.length - 1;
        //loop for each element int the array
        while (start <= end) {
            //finding the mid element index in given array
            int mid = start + (end - start) / 2;
            //if the starting element in the given array is less than last element in the given array
            //mean array in ascending order
            if (arr[0]<arr[arr.length-1]){
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            //array element in desceng=ding order
            else{
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
