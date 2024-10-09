class Solution {
    public long maximumSumOfHeights(int[] heights) {
        // TC : O(N * N) // SC : O(1)
        int n = heights.length;
        long ans = 0;
        for(int i = 0; i < n; i++) {
            int ele = heights[i];
            long ele2 = heights[i];
            int in = i;
            int j = in-1;
            int k = in+1;
            while(j >= 0 && heights[j] == ele) {
                ele2 += heights[j];
                j--;
            } 
            while(k < n && heights[k] == ele) {
                ele2 += heights[k];
                k++;
            }
            int amm = heights[i];
            int amb = heights[i];
            while(j >= 0) {
                amm = Math.min(amm, heights[j]);
                ele2 += amm;
                j--;
            }
            while(k < n) {
                amb = Math.min(amb, heights[k]);
                ele2 += amb;
                k++;
            }
            ans = Math.max(ans, ele2);
        }
        return ans;
    }
}