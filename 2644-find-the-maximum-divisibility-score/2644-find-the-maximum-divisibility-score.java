class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        // TC : O(M * N) // SC : O(1)
        int m = divisors.length;
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        int maxDiv = 0;
        for(int i = 0; i < m; i++) {
            int v = 0;
            for(int j = 0; j < n; j++) {
                if(nums[j] % divisors[i] == 0) v++;
            }
            if(v > maxDiv) {
                maxDiv = v;
                ans = divisors[i];
            }
            if(v == maxDiv) {
                ans = Math.min(ans, divisors[i]);
            }
        }
        return ans;
    }
}