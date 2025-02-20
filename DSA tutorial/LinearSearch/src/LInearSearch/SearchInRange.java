package LInearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int [] arr={12,24,69,88,41,25,75,52};
        int target=12;
        System.out.println(LinearSearch(arr,target,1,6));
    }
    static int LinearSearch(int [] arr,int target, int start, int end){
        if(arr.length==0){
            return -1;
        }
        //run a for loop
        for (int i = start; i <=end; i++) {
            if(arr[i]== target){
                return i;// i means index of element found
            }
        }
        return -1;
    }
}
