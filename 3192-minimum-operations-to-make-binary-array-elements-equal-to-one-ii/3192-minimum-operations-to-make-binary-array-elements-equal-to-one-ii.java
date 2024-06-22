class Solution {
    public int minOperations(int[] nums) {
        // TC : O(N) // SC : O(1)
        int n = nums.length;
        int ans = 0;
        int in = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] == 0 && in==0) {
                ans++;
                in=1-in;
            }
            else if(nums[i] == 1 && in==1) {
                ans++;
                in=1-in;
            }
        }
        return ans;
    }
}