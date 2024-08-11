class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        boolean flag = true;
        for(int i = 0; i < n-1; i++) {
            if(nums[i] > nums[i+1]) {
                flag = false;
                break;
            }
        }
        if(flag == true) return true;
        boolean flag2 = true;
        for(int i = 0; i < n-1; i++) {
            if(nums[i] < nums[i+1]) {
                flag2 = false;
                break;
            }
        }
        if(flag2 == true) return true;
        return false;
    }
}