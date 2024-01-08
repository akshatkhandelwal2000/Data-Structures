class Solution {
    public int xorBeauty(int[] nums) {
        int n = nums.length;
        int xo = 0;
        for(int i = 0; i < n; i++) {
            xo ^= nums[i];
        }
        return xo;
    }
}