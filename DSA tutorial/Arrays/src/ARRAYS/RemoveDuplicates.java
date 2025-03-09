package ARRAYS;

public class RemoveDuplicates {

    public int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0; // Handle empty array case

        int k = 0; // Pointer to track unique elements
        for (int i = 1; i < arr.length; i++) { // Start from index 1
            if (arr[k] != arr[i]) { // If a new unique element is found
                k++;
                arr[k] = arr[i]; // Move the unique element forward
            }
        }
        return k + 1; // Return the count of unique elements
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        RemoveDuplicates obj = new RemoveDuplicates(); // Create an instance
        int result = obj.removeDuplicates(arr);
        System.out.println("Number of unique elements: " + result);
    }
}
