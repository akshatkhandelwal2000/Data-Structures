class Solution {
    public int[] leftRightDifference(int[] nums) {
        // TC : O(N) // SC : O(N)
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        int[] ans = new int[n];
        leftSum[0] = 0;
        int sum = nums[0];
        for(int i = 1; i < n; i++) {
            leftSum[i] = sum;
            sum += nums[i];
        }
        rightSum[n-1] = 0;
        sum = nums[n-1];
        for(int i = n-2; i >= 0; i--) {
            rightSum[i] = sum;
            sum += nums[i];
        }
        for(int i = 0; i < n; i++) {
            ans[i] = Math.abs(leftSum[i]-rightSum[i]);
        }
        return ans;
    }
}