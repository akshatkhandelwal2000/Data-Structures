class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        if(k == 1) return nums;
        int[] ans = new int[n-k+1];
        for(int i = 0; i < n-k+1; i++) {
            int m = -1;
            for(int j = i+1; j <= i+k-1; j++) {
                m = Math.max(m, nums[j]);
                if(nums[j] != nums[j-1]+1) {
                    m = -1;
                    break;
                }
            }
            ans[i] = m;
        }
        return ans;
    }
}