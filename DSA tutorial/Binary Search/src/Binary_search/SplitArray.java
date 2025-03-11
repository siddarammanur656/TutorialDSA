package Binary_search;

public class SplitArray {
    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        int m = 2;

        // Create an instance of SplitArray to call the method
        SplitArray obj = new SplitArray();
        System.out.println(obj.splitArray(nums, m));  // Corrected method call
    }

    public int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for (int num : nums) {
            start = Math.max(start, num); // Maximum single element
            end += num; // Sum of all elements
        }

        // Binary search
        while (start < end) {
            int mid = start + (end - start) / 2;

            // Count subarrays needed for this `mid` as the max sum
            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    sum = num;
                    pieces++; // New subarray
                } else {
                    sum += num;
                }
            }

            if (pieces > m) {
                start = mid + 1; // Increase the max sum limit
            } else {
                end = mid; // Try to minimize max sum
            }
        }
        return end; // or start, since both will be equal
    }
}
