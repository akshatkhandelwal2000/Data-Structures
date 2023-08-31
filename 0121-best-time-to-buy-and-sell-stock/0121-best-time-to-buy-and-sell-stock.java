class Solution {
    public int maxProfit(int[] prices) {
        // TC : O(N) // SC : O(1)
        int maxprof = 0, minprice = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < minprice) {
                minprice = prices[i];
            }
            else if(prices[i]-minprice > maxprof) {
                maxprof = prices[i]-minprice;
            }
        }
        return maxprof;
    }
}