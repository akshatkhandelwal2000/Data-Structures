class Solution {
    public int minKBitFlips(int[] nums, int k) {
        // TC : O(N) // SC : O(1)
        int n = nums.length;
        int ans = 0;
        int flip = 0;
        for(int i = 0; i < n; i++) {
            if(i >= k && nums[i-k] == 2) {
                flip--;
            }
            if(flip%2 == nums[i]) {
                if(i+k > n) return -1;
                nums[i] = 2;
                flip++;
                ans++;
            }
        }
        return ans;
    }
}