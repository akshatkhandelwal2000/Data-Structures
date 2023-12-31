// class Solution {
//     public boolean isInterleave(String s1, String s2, String s3) {
        // Memoization
        // Complexity Analysis
        // Time Complexity: O(m*n*N) 
        // Space Complexoty: O(m*n*N) 
        // using 3d array having 3 states m n N
    //     int m = s1.length();
    //     int n = s2.length();
    //     int N = s3.length();
    //     if(m + n != N) return false;
    //     Boolean[][][] dp = new Boolean[m+1][n+1][N+1];
    //     return rec(0, 0, 0, m, n, N, s1, s2, s3, dp);
    // }
    // public boolean rec(int i, int j, int k, int m, int n, int N, String s1, String s2, String s3, Boolean[][][] dp) {
    //     if(i == m && j == n && k == N) return true;
    //     if(k >= N) return false;
    //     if(dp[i][j][k] != null) return dp[i][j][k]; 
    //     boolean result = false;
    //     if(i < m && s1.charAt(i) == s3.charAt(k)) {
    //         result = rec(i+1, j, k+1, m, n, N, s1, s2, s3, dp);
    //     }
    //     if(result == true) return dp[i][j][k] = result;
    //     if(j < n && s2.charAt(j) == s3.charAt(k)) {
    //         result = rec(i, j+1, k+1, m, n, N, s1, s2, s3, dp);
    //     }
    //     return dp[i][j][k] = result;
//     } 
// }

class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        // Memoization
        // Complexity Analysis
        // Time Complexity: O(m*n) 
        // Space Complexoty: O(m*n) 
        // using 2d array having 2 states m n
        int m = s1.length();
        int n = s2.length();
        int N = s3.length();
        if(m + n != N) return false;
        Boolean[][] dp = new Boolean[m+1][n+1];
        return rec(0, 0, m, n, N, s1, s2, s3, dp);
    }
    public boolean rec(int i, int j, int m, int n, int N, String s1, String s2, String s3, Boolean[][] dp) {
        if(i == m && j == n && i+j == N) return true;
        if(i+j >= N) return false;
        if(dp[i][j] != null) return dp[i][j]; 
        boolean result = false;
        if(i < m && s1.charAt(i) == s3.charAt(i+j)) {
            result = rec(i+1, j, m, n, N, s1, s2, s3, dp);
        }
        if(result == true) return dp[i][j] = result;
        if(j < n && s2.charAt(j) == s3.charAt(i+j)) {
            result = rec(i, j+1, m, n, N, s1, s2, s3, dp);
        }
        return dp[i][j] = result;
    } 
}