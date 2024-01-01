class Solution {
    public int maxProfit(int[] prices) {
        // Memoization
        // Complexity Analysis
        // Time Complexity: O(N*2)
        // Space Complexity: O(N*2);
        int n = prices.length;
        int[][] dp = new int[n][2];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 2; j++) {
                dp[i][j] = -1;
            }
        }
        return rec(0, 1, n, prices, dp);
    }
    public int rec(int i, int buy, int n, int[] prices, int[][] dp) {
        if(i >= n ) return 0;
        if(dp[i][buy] != -1) return dp[i][buy];
        if(buy == 1) {
            return dp[i][buy] = Math.max(-prices[i] + rec(i+1, 0, n, prices, dp),
                           0 + rec(i+1, 1, n, prices, dp));
        }
        return dp[i][buy] = Math.max(prices[i] + rec(i+2, 1, n, prices, dp),
                       0 + rec(i+1, 0, n, prices, dp));
    }
}