package Sorting;

import java.util.Arrays;

public class MissingNumbers268 {

    public static void main(String[] args) {
        int [] nums={9,6,4,2,3,5,7,0,1};
        System.out.println(MissingNumber(nums));
    }

    public static int MissingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if(nums[index]!=index){
                return index;
            }
        }
        return nums.length;
    }

    static void  swap(int [] arr ,int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}