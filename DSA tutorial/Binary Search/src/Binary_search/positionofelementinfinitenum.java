package Binary_search;

public class positionofelementinfinitenum {
    public static void main(String[] args) {
        int [] arr={2,3,4,9,14,16,18,23,25,36,52,54,58};
        int target=16;
        System.out.println(ans(arr,target));
    }

     static int ans(int[] arr, int target) {
         int start=0;
         int end=1;
         while(target>arr[end]){
             int tem=end+1;//new start
             end=end+(end-start+1)*2;//new end
             start=tem;
         }
         return BinarySearch(arr , target,start,end );
    }
    static int BinarySearch(int [] arr , int target ,int start ,  int  end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}

