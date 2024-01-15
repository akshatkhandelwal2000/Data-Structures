// class Solution {
//     public int maximalSquare(char[][] matrix) {
//         // Tabulation
//         // Complexity Analysis
//         // Time Complexity: O(N*M)
//         // Space Complexity: O(N*M)
//         if(matrix.length == 0 || matrix[0].length == 0) return 0; 
//         int m = matrix.length;
//         int n = matrix[0].length;
//         int square = 0;
//         int[][] dp = new int[m+1][n+1];
//         for(int i = 1; i <= m; i++) {
//             for(int j = 1; j <= n; j++) {
//                 if(matrix[i-1][j-1] == '1') {
//                     dp[i][j] = 1 + Math.min(dp[i-1][j], Math.min(dp[i-1][j-1], dp[i][j-1]));
//                     square = Math.max(square, dp[i][j]);
//             }    }
//         }
//         return square*square;
//     }
// }

// class Solution {
//     int max = 0;
//     public int maximalSquare(char[][] matrix) {
//         // TC : O(M*N) // SC : O(M*N) + O(M+N)
//         if(matrix.length == 0 || matrix[0].length == 0) return 0;
//         int m = matrix.length;
//         int n = matrix[0].length;
//         int[][] dp = new int[m][n];
//         for(int i = 0; i < m; i++) {
//             for(int j = 0; j < n; j++) {
//                 dp[i][j] = -1;
//             }
//         }
//         rec(matrix, 0, 0, dp);
//         return max * max;
//     }
//     public int rec(char[][] mat, int i, int j, int[][] dp) {
//         if(i >= mat.length || j >= mat[0].length) return 0;
//         if(dp[i][j] != -1) return dp[i][j];
//         int down = rec(mat, i+1, j, dp);
//         int right = rec(mat, i, j+1, dp);
//         int diagonal = rec(mat, i+1, j+1, dp);
//         if(mat[i][j] == '1') {
//             int ans = 1 + Math.min(down, Math.min(right, diagonal));
//             max = Math.max(max, ans);
//             return dp[i][j] = ans;
//         }
//         else {
//             return 0;
//         }
//     }
// }

class Solution {
    public int maximalSquare(char[][] matrix) {
        // TC : O(M*N) // SC : O(M*N)
        if(matrix.length == 0 || matrix[0].length == 0) return 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m+1][n+1];
        int max = 0;
        for(int i = m-1; i >= 0; i--) {
            for(int j = n-1; j >= 0; j--) {
                int down = dp[i+1][j];
                int right = dp[i][j+1];
                int diagonal = dp[i+1][j+1];
                if(matrix[i][j] == '1') {
                    dp[i][j] = 1 + Math.min(down, Math.min(right, diagonal));
                    max = Math.max(max, dp[i][j]);
                }
            }
        }
        return max * max;
    }
}