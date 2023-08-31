class Solution {
    public void rotate(int[][] matrix) {
        // TC : O(N^2) + O(N * N/2) // SC : O(1)
        for(int i = 0; i < matrix.length; i++) {
            for(int j = i; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }
    }
}