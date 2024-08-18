class Solution {
    public long maxEnergyBoost(int[] energyDrinkA, int[] energyDrinkB) {
        int n = energyDrinkA.length;
        long[][] dp = new long[n][2];
        dp[0][0] = energyDrinkA[0];
        dp[0][1] = energyDrinkB[0];
        for(int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i-1][0]+energyDrinkA[i], dp[i-1][1]);
            dp[i][1] = Math.max(dp[i-1][1]+energyDrinkB[i], dp[i-1][0]);
        }
        return Math.max(dp[n-1][0], dp[n-1][1]);
    }
}