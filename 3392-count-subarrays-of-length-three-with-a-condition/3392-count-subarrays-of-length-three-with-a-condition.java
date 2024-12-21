class Solution {
    public int countSubarrays(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i = 1; i <= n-2; i++) {
            if(nums[i-1]+nums[i+1] == (double)nums[i]/2.0) {
                ans++;
            }
        }
        return ans;
    }
}