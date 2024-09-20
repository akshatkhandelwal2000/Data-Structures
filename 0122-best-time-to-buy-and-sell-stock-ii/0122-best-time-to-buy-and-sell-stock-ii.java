class Solution {
    public int maxProfit(int[] prices) {
        // TC : O(N) // SC : O(1)
        int maxprof = 0;
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i-1]) {
                maxprof += prices[i] - prices[i-1];
            }
        }
        return maxprof;
    }
}