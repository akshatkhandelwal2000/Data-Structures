// class Solution {
//     public int longestCommonSubsequence(String text1, String text2) {
       // Memoization
       // Complexity Analysis
       // Time Complexity: O(N*M)

       // Reason: There are N*M states therefore at max ‘N*M’ new problems will be solved.

       // Space Complexity: O(N*M) + O(N+M)

       // Reason: We are using an auxiliary recursion stack space(O(N+M)) (see the recursive           tree, in the worst case, we will go till N+M calls at a time) and a 2D array ( O(N*M)).
//         int m = text1.length();
//         int n = text2.length();
//         int[][] dp = new int[m][n];
//         for(int i = 0; i < m; i++) {
//             for(int j = 0; j < n; j++) {
//                 dp[i][j] = -1;
//             }
//         }
//         return rec(m-1, n-1, text1, text2, dp);
//     }
//     public int rec(int i, int j, String text1, String text2, int[][] dp) {
//         if(i < 0 || j < 0) return 0;
//         if(dp[i][j] != -1) return dp[i][j];
//         if(text1.charAt(i) == text2.charAt(j)) {
//             return dp[i][j] = 1 + rec(i-1, j-1, text1, text2, dp); 
//         }
//         else {
//         return dp[i][j] = Math.max(rec(i, j-1, text1, text2, dp), rec(i-1, j, text1, text2, dp));
//         }
//     }
// }

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
    // Tabulation
    // Complexity Analysis
    // Time Complexity: O(N*M)

    // Reason: There are two nested loops

    // Space Complexity: O(N*M)

    // Reason: We are using an external array of size ‘N*M)’. Stack Space is eliminated.
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m+1][n+1];
        for(int i = 0; i <= m; i++) dp[i][0] = 0;
        for(int j = 0; j <= n; j++) dp[0][j] = 0;
        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                if(text1.charAt(i-1) == text2.charAt(j-1)) dp[i][j] = 1 + dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
            }
        }
        return dp[m][n];
    }
}