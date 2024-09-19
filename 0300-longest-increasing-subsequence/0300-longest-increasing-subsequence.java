class Solution {
    public int lengthOfLIS(int[] nums) {
        // TC : O(N*N) // SC : O(N*N)
    //     int n = nums.length;
    //     if(n <= 1) return n;
    //     int[][] dp = new int[n][n+1];
    //     for(int[] rows : dp) {
    //         Arrays.fill(rows, -1);
    //     }
    //     return lis(nums, 0, -1, dp);
    // }
    // private int lis(int[] nums, int currIndex, int prevIndex, int[][] dp) {
    //     if(currIndex == nums.length) return 0;
    //     if(dp[currIndex][prevIndex+1] != -1) return dp[currIndex][prevIndex+1];
    //     int skip = lis(nums, currIndex+1, prevIndex, dp);
    //     int select = -1;
    //     if(prevIndex == -1 || nums[currIndex] > nums[prevIndex]) {
    //     select = 1+lis(nums, currIndex+1, currIndex, dp);
    //     }
    //     dp[currIndex][prevIndex+1] = Math.max(skip, select);
    //     return dp[currIndex][prevIndex+1];
        // TC : O(N*N) // SC : O(N)
           int n = nums.length;
           if(n <= 1) return n;
           int[] dp = new int[n];
           Arrays.fill(dp, 1);
           int maxlength = 0;
           for(int i = 1; i < n; i++) {
               for(int j = 0; j < i; j++) {
                   if(nums[i] > nums[j]) {
                       dp[i] = Math.max(dp[i], 1+dp[j]);
                   }
               }
               maxlength = Math.max(maxlength, dp[i]);
           }
           return maxlength;
    }
}