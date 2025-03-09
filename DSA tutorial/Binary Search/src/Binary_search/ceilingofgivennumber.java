package Binary_search;

public class ceilingofgivennumber {
    public static void main(String[] args) {
        //taking input array
        int[] arr = {2,3,5,9,14,16,18};
        //initializing target element to be find the index of the element
        int target = 15;
        //calling the binary_s method to find the index of target element
        System.out.println(ceiling(arr, target));
    }

    static int ceiling(int[] arr, int target) {
        int start=0;
        int end =arr.length-1;
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        while (start<=end){
            int mid = start + (end - start) / 2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return start;
    }
}
