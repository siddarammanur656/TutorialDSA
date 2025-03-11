package Binary_search;

public class RotatedBS {
    public static void main(String[] args) {
        int [] arr ={6,7,8,1,2,3,4,5};
        System.out.println(CountRBS(arr));
    }
    static int Findpivote(int [] arr){
        int start =0;
        int end = arr.length-1;

        while(start<end){
            int mid = start+(end-start)/2;
            if(mid<end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if (mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if (arr[mid]<=arr[start]){
                end = mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }

    static int CountRBS(int [] arr) {
        int start =0;
        int end = arr.length-1;
        int count =0 ;
        while(start<end){
            int mid = start+(end-start)/2;
            if(mid<end && arr[mid] > arr[mid+1]){
                count=mid+1;
                return count;
            }
            if (mid>start && arr[mid]<arr[mid-1]){
                count=mid;
                return count;
            }
            if (arr[mid]<=arr[start]){
                end = mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }

}
