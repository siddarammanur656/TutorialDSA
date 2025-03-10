package Binary_search;

import java.util.Arrays;

public class Firstandlastpositionofelement {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        // check for first occurrence of target
        ans[0] = Search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = Search(nums, target, false);
        }
        return ans;
    }

    // This function returns the index value of target
    static int Search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential answer found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;  // Look on the left side
                } else {
                    start = mid + 1; // Look on the right side
                }
            }
        }
        return ans;
    }
}
