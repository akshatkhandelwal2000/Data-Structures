class Solution {
    public boolean check(int[] nums) {
        // TC : O(N) // SC : O(1)
        int n = nums.length;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] > nums[(i+1)%n]) {
                ans++;
            }
        }
        return ans <= 1;
    }
}