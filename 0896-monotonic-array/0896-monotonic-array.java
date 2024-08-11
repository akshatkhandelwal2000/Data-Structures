class Solution {
    public boolean isMonotonic(int[] nums) {
        // TC : O(N) // SC : O(1)
        int n = nums.length;
        boolean flag = true;
        boolean flag2 = true;
        for(int i = 0; i < n-1; i++) {
            if(nums[i] > nums[i+1]) {
                flag = false;
            }
            if(nums[i] < nums[i+1]) {
                flag2 = false;
            }
        }
        if(flag == true || flag2 == true) return true;
        return false;
    }
}