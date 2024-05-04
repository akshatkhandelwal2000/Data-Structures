class Solution {
    public int maxScore(int[] nums) {
        // TC : O(NlogN) // SC : O(N)
        int n = nums.length;
        Arrays.sort(nums);
        long[] pre = new long[n];
        int ans = 0;
        int in = 0;
        for(int i = n-1; i >= 0; i--) {
            pre[in++] = nums[i];
        }
        for(int i = 1; i < n; i++) {
            pre[i] = pre[i] + pre[i-1];
        }
        for(int i = 0; i < n; i++) {
            if(pre[i] > 0) ans++;
        }
        return ans;
    }
}