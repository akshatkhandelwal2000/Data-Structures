class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n+1][amount+1];
        for(int i = 0; i < dp.length; i++) {
            for(int j = 0; j <= amount; j++) {
                dp[i][j] = -1;
            }
        }
        return solve(0, amount, coins, dp);
    }
    public int solve(int i, int amount, int[] coins, int[][] dp) {
        if(amount == 0) {
            return 1;
        }
        if(i == coins.length || amount < 0) {
            return 0;
        }
        if(dp[i][amount] != -1) {
            return dp[i][amount];
        }
        if(coins[i] > amount) {
            return dp[i][amount] = solve(i+1, amount, coins, dp);
        }
        int take = solve(i, amount-coins[i], coins, dp);
        int nottake = solve(i+1, amount, coins, dp);
        return dp[i][amount] = take+nottake;
    }
}