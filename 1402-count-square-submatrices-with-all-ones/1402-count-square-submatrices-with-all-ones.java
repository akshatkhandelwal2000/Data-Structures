class Solution {
    public int countSquares(int[][] matrix) {
        // TC : O(M*N) // SC : O(M*N)
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int ans = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == 1) {
                    ans += cou(i, j, matrix, dp);
                }
            }
        }
        return ans;
    }
    public int cou(int i, int j, int[][] matrix, int[][] dp) {
        if(i >= matrix.length || j >= matrix[0].length || matrix[i][j] == 0) {
            return 0;
        }
        if(dp[i][j] != -1) {
            return dp[i][j];
        }
        int a = cou(i+1, j, matrix, dp);
        int b = cou(i, j+1, matrix, dp);
        int c = cou(i+1, j+1, matrix, dp);
        return dp[i][j] = 1+Math.min(a, Math.min(b, c));
    }
}