// class Solution {
//     public int minimumTotal(List<List<Integer>> triangle) {
    // Memoization
    // Complexity Analysis
    // Time Complexity: O(N*N)

    // Reason: There are two nested loops

    // Space Complexity: O(N*N) + O(N)
    // Reason: We are using an external array of size ‘N*N’. The stack space will be O(N).
    //     int n = triangle.size();
    //     int[][] dp = new int[n][n];
    //     for(int i = 0; i < n; i++) {
    //         for(int j = 0; j < n; j++) {
    //             dp[i][j] = -1;
    //         }
    //     }
    //     return rec(0, 0, triangle, n, dp);
    // }
    // public int rec(int i, int j, List<List<Integer>> triangle, int n, int[][] dp) {
    //     if(i == n-1) return triangle.get(n-1).get(j);
    //     if(dp[i][j] != -1) return dp[i][j];
    //     int down = triangle.get(i).get(j) + rec(i+1, j, triangle, n, dp);
    //     int diagonal = triangle.get(i).get(j) + rec(i+1, j+1, triangle, n, dp);
    //     return dp[i][j] = Math.min(down, diagonal);
//     }
// }

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
    // Tabulation
    // Complexity Analysis
    // Time Complexity: O(N*N)

    // Reason: There are two nested loops

    // Space Complexity: O(N*N)

    // Reason: We are using an external array of size ‘N*N’. The stack space will be                eliminated.
        int n = triangle.size();
        int[][] dp = new int[n][n];
        for(int j = 0; j < n; j++) dp[n-1][j] = triangle.get(n-1).get(j);
        for(int i = n-2; i >= 0; i--) {
            for(int j = i; j >= 0; j--) {
                int down = triangle.get(i).get(j) + dp[i+1][j];
                int diagonal = triangle.get(i).get(j) + dp[i+1][j+1];
                dp[i][j] = Math.min(down, diagonal);
            }
        }
        return dp[0][0];
    }
}