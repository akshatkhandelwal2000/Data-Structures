// class Solution {
//     public int maxProfit(int[] prices, int fee) {
//         // Memoization
//         // Complexity Analysis
//         // Time Complexity: O(N*2)
//         // Space Complexity: O(N*2);
//         int n = prices.length;
//         int[][] dp = new int[n][2];
//         for(int i = 0; i < n; i++) {
//             for(int j = 0; j < 2; j++) {
//                 dp[i][j] = -1;
//             }
//         }
//         return rec(0, 1, n, prices, dp, fee);
//     }
//     public int rec(int i, int buy, int n, int[] prices, int[][] dp, int fee) {
//         if(i >= n ) return 0;
//         if(dp[i][buy] != -1) return dp[i][buy];
//         int profit = 0;
//         if(buy == 1) {
//             profit = Math.max(-prices[i] + rec(i+1, 0, n, prices, dp, fee),
//                            0 + rec(i+1, 1, n, prices, dp, fee));
//         }
//         if(buy == 0) {
//         profit = Math.max(prices[i]-fee + rec(i+1, 1, n, prices, dp, fee),
//                        0 + rec(i+1, 0, n, prices, dp, fee));
//         }
//         dp[i][buy] = profit;
//         return profit;
//     }
// }
class Solution {
    public int maxProfit(int[] prices, int fee) {
        // Complexity Analysis
        // Time Complexity: O(N)
        // Space Complexity: O(N*2)
        int n = prices.length;
        int[][] dp = new int[n+1][2];
        for(int i = n-1; i >= 0; i--) {
            //for(int buy = 0; buy <= 1; buy++) {
                //if(buy == 1) {
                    dp[i][1] = Math.max(-prices[i] + dp[i+1][0],
                           0 + dp[i+1][1]);
                //} else
                 dp[i][0] = Math.max(prices[i]-fee + dp[i+1][1],
                                             0 + dp[i+1][0]);
                
            //}
        }
        return dp[0][1];
    }
}