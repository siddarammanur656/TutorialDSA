package ARRAYS;

// Define the Solution class
class Solution {

    // Method to concatenate the array with itself
    public int[] getConcatenation(int[] nums) {

        // Get the length of the input array
        int n = nums.length;

        // Create a new array 'ans' with double the size of 'nums'
        int[] ans = new int[2 * n];

        // Loop through each element of 'nums'
        for (int i = 0; i < n; i++) {
            // Copy the element to the first half of 'ans'
            ans[i] = nums[i];

            // Copy the same element to the second half of 'ans'
            ans[i + n] = nums[i];
        }

        // Return the concatenated array
        return ans;
    }

    // Main method to test the getConcatenation method
    public static void main(String[] args) {
        // Create an object of the Solution class
        Solution solution = new Solution();

        // Example input array
        int[] nums = {1, 2, 3};

        // Call the getConcatenation method and store the result
        int[] result = solution.getConcatenation(nums);

        // Print the result array
        System.out.print("Concatenated array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

