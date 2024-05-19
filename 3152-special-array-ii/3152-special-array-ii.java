class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        // TC : O(N + M) // SC : O(N + M)
        int n = nums.length;
        int m = queries.length;
        int[] parity = new int[n];
        boolean[] ans = new boolean[m];
        for(int i = 1; i < n; i++) {
            if(nums[i] % 2 != nums[i-1] % 2) {
                parity[i] = parity[i-1]+1;
            }
            else {
                parity[i] = 0;
            }
        }
        for(int i = 0; i < m; i++) {
            int j = queries[i][0];
            int k = queries[i][1];
            int par = parity[k] - parity[j];
            if(par == k-j) {
                ans[i] = true;
            }
        }
        return ans;
    }
}