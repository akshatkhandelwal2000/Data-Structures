class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;
        int[] ans = new int[n];
        int max = (int)Math.pow(2, maximumBit)-1;
        int a = 0;
        for(int i = 0; i < n; i++) {
            a ^= nums[i];
            ans[n-i-1] = a^max;
        }
        return ans;
    }
}