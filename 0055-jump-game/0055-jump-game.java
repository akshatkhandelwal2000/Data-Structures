class Solution {
    public boolean canJump(int[] nums) {
        // TC : O(N) // SC : O(1)
        int n = nums.length;
        int maxJump = 0;
        for(int i = 0; i < n; i++) {
            if(i > maxJump) return false;
            maxJump = Math.max(maxJump, nums[i]+i);
            if(maxJump >= n-1) return true;
        }
        return true;
    }
}