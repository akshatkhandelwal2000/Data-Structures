// class Solution {
//     public int minPathSum(int[][] grid) {
    // Memoization
    // Complexity Analysis
    // Time Complexity: O(N*M)

    // Reason: At max, there will be N*M calls of recursion.

    // Space Complexity: O((M-1)+(N-1)) + O(N*M)

    // Reason: We are using a recursion stack space: O((M-1)+(N-1)), here (M-1)+(N-1) is the        path length and an external DP Array of size ‘N*M’
    //     int m = grid.length;
    //     int n = grid[0].length;
    //     int[][] dp = new int[m][n];
    //     for(int i = 0; i < m; i++) {
    //         for(int j = 0; j < n; j++) {
    //             dp[i][j] = -1;
    //         }
    //     }
    //     return rec(m-1, n-1, grid, dp);
    // }
    // public int rec(int i, int j, int[][] grid, int[][] dp) {
    //     if(i == 0 && j == 0) {
    //         return grid[i][j];
    //     }
    //     if(i < 0 || j < 0) {
    //         return (int)1e9;
    //     }
    //     if(dp[i][j] != -1) return dp[i][j];
    //     int up = grid[i][j] + rec(i-1, j, grid, dp);
    //     int left = grid[i][j] + rec(i, j-1, grid, dp);
    //     return dp[i][j] = Math.min(up, left);
//     }
// }

class Solution {
    public int minPathSum(int[][] grid) {
    // Tabulation
    // Complexity Analysis
    // Time Complexity: O(N*M)

    // Reason: There are two nested loops

    // Space Complexity: O(N*M)

    // Reason: We are using an external array of size ‘N*M’’.
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(i == 0 && j == 0) dp[i][j] = grid[i][j];
                else {
                    int up = grid[i][j];
                    if(i > 0) {
                        up += dp[i-1][j];
                    }
                    else up += (int)1e9;
                    int left = grid[i][j];
                    if(j > 0) {
                        left += dp[i][j-1];
                    }
                    else left += (int)1e9;
                    dp[i][j] = Math.min(up, left);
                }
            }
        }
        return dp[m-1][n-1];
     }
}
