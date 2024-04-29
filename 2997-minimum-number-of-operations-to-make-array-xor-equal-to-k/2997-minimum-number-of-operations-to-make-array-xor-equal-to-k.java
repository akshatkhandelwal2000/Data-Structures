class Solution {
    public int minOperations(int[] nums, int k) {
        // TC : O(N) + O(32) // SC : O(1)
        int n = nums.length;
        int xor = 0;
        for(int i = 0; i < n; i++) {
            xor ^= nums[i];
        }
        int ans = 0;
        for(int i = 0; i < 32; i++) {
            int m1 = xor&(1 << i);
            int m2 = k&(1 << i);
            if(m1 != m2) ans++;
        }
        return ans;
    }
}