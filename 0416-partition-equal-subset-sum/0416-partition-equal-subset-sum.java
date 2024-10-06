class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += nums[i];
        }
        if(sum % 2 != 0) {
            return false;
        }
        Boolean[][] dp = new Boolean[n+1][sum+1];
        return solve(0, nums, dp, sum, 0);
    }
    public boolean solve(int i, int[] nums, Boolean[][] dp, int sum, int target) {
        if(i >= nums.length) {
            return false;
        }
        if(dp[i][sum] != null) {
            return dp[i][sum];
        }
        if(sum == target) {
            return true;
        }
        boolean nottake = solve(i+1, nums, dp, sum, target);
        boolean take = solve(i+1, nums, dp, sum-nums[i], target+nums[i]);
        return dp[i][sum] = take || nottake;
    }
}