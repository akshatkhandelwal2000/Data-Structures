class Solution {
    public int maxGoodNumber(int[] nums) {
        // TC : O(1) // SC : O(1)
        int n = nums.length;
        int ans = 0;
        String s = Integer.toBinaryString(nums[0]);
        s += Integer.toBinaryString(nums[1]);
        s += Integer.toBinaryString(nums[2]);
        if(Integer.parseInt(s, 2) > ans) {
            ans = Integer.parseInt(s, 2);
        }
        s = "";
        s = Integer.toBinaryString(nums[0]);
        s += Integer.toBinaryString(nums[2]);
        s += Integer.toBinaryString(nums[1]);
        if(Integer.parseInt(s, 2) > ans) {
            ans = Integer.parseInt(s, 2);
        }
        s = "";
        s = Integer.toBinaryString(nums[1]);
        s += Integer.toBinaryString(nums[0]);
        s += Integer.toBinaryString(nums[2]);
        if(Integer.parseInt(s, 2) > ans) {
            ans = Integer.parseInt(s, 2);
        }
        s = "";
        s = Integer.toBinaryString(nums[1]);
        s += Integer.toBinaryString(nums[2]);
        s += Integer.toBinaryString(nums[0]);
        if(Integer.parseInt(s, 2) > ans) {
            ans = Integer.parseInt(s, 2);
        }
        s = "";
        s = Integer.toBinaryString(nums[2]);
        s += Integer.toBinaryString(nums[0]);
        s += Integer.toBinaryString(nums[1]);
        if(Integer.parseInt(s, 2) > ans) {
            ans = Integer.parseInt(s, 2);
        }
        s = "";
        s = Integer.toBinaryString(nums[2]);
        s += Integer.toBinaryString(nums[1]);
        s += Integer.toBinaryString(nums[0]);
        if(Integer.parseInt(s, 2) > ans) {
            ans = Integer.parseInt(s, 2);
        }
        return ans;
    }
}