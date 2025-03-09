package LInearSearch;
class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int [][] arr = new int[m][n];

        // Increment rows and columns based on indices
        for(int i = 0; i < indices.length; i++){
            int rowindex = indices[i][0];
            int colindex = indices[i][1];

            // Increment entire row
            for(int j = 0; j < n; j++){
                arr[rowindex][j] += 1;
            }

            // Increment entire column
            for(int j = 0; j < m; j++){
                arr[j][colindex] += 1;
            }
        }

        // Count odd values
        int count = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j] % 2 != 0){
                    count++;
                }
            }
        }
        return count;
    }

    // Main method to test the function
    public static void main(String[] args) {
        Solution1 solution = new Solution1();

        int m = 2, n = 3;
        int[][] indices = { {0, 1}, {1, 1} };

        int result = solution.oddCells(m, n, indices);
        System.out.println("Number of cells with odd values: " + result);
    }
}
