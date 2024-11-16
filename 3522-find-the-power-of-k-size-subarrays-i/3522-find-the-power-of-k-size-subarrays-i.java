class Solution {
    public int[] resultsArray(int[] nums, int k) {
        // TC : O(N*K) // SC : O(N-K+1)
        int n = nums.length;
        if(k == 1) {
            return nums;
        }
        int[] ans = new int[n-k+1];
        for(int i = 0; i < n-k+1; i++) {
            int max = -1;
            for(int j = i+1; j <= i+k-1; j++) {
                max = Math.max(max, nums[j]);
                if(nums[j]-1 != nums[j-1]) {
                    max = -1;
                    break;
                }
            }
            ans[i] = max;
        }
        return ans;
    }
}