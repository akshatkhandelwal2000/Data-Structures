class Solution {
    public long maximumSumOfHeights(int[] heights) {
        int n = heights.length;
        long am = heights[0];
        int aml = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++) {
            aml = Math.min(aml, heights[i]);
            am += aml;
        }
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
            int min = Integer.MAX_VALUE;
            int min2 = Integer.MAX_VALUE;
            int dex = j+1;
            int dex2 = n-k;
            while(j >= 0) {
                min = Math.min(min, heights[j]);
                j--;
            }
            while(k < n) {
                min2 = Math.min(min2, heights[k]);
                k++;
            }
            long an = min*dex;
            long anc = min2*dex2;
            ele2 += an;
            ele2 += anc;
            ans = Math.max(ans, ele2);
        }
        return Math.max(ans, am);
    }
}