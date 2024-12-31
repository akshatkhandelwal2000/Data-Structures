class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        // TC : O(N) // SC : O(1)
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            if(nums[i] == target && Math.abs(i-start) < ans) {
                ans = Math.abs(i-start);
            }
        }
        return ans;
    }
}