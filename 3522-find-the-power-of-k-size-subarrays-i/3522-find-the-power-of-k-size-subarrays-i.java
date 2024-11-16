class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        if(k == 1) {
            return nums;
        }
        int[] ans = new int[n-k+1];
        for(int i = 0; i < n-k+1; i++) {
            int max = 0;
            for(int j = i+1; j <= i+k-1; j++) {
                if(nums[j] < nums[j-1] || nums[j]-1 != nums[j-1]) {
                    ans[i] = -1;
                    break;
                }
                max = Math.max(max, nums[j]);
            }
            if(ans[i] != -1) {
                ans[i] = max;
            }
        }
        return ans;
    }
}