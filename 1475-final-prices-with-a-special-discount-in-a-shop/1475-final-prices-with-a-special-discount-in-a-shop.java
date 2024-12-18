class Solution {
    public int[] finalPrices(int[] prices) {
        // TC : O(N^2) // SC : O(N)
        int n = prices.length;
        int[] ans = new int[n];
        for(int i = 0; i < n; i++) {
            int min = 0;
            for(int j = i+1; j < n; j++) {
                if(prices[j] <= prices[i]) {
                    min = prices[j];
                    break;
                }
            }
            ans[i] = prices[i]-min;
        }
        return ans;
    }
}