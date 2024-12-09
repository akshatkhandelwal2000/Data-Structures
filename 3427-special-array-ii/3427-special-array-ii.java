class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        // TC : O(M+N) // SC : O(M+N)
        int n = nums.length;
        boolean[] ans = new boolean[queries.length];
        int[] a = new int[n];
        for(int i = 1; i < n; i++) {
            if(nums[i]%2 != nums[i-1]%2) {
                a[i] = a[i-1]+1;
            }
        }
        for(int i = 0; i < queries.length; i++) {
            int j = queries[i][0];
            int k = queries[i][1];
            if(a[k]-a[j] == k-j) {
                ans[i] = true;
            }
        }
        return ans;
    }
}