class Solution {
    public int minOperations(int[] nums) {
        // TC : O(N) // SC : O(1)
        int n = nums.length;
        int ans = 0;
        for(int i = 0; i <= n-3; i++) {
            if(nums[i]==0) {
                nums[i]=1;
                nums[i+1] = 1-nums[i+1];
                nums[i+2] = 1-nums[i+2];
                ans++;
            }
        }
        for(int i = 0; i < n; i++) {
            if(nums[i]==0) return -1;
        }
        return ans;
    }
}