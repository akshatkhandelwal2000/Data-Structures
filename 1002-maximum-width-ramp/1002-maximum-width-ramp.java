class Solution {
    public int maxWidthRamp(int[] nums) {
        // TC : O(N) // SC : O(N)
        int n = nums.length;
        int[] right = new int[n];
        right[n-1] = nums[n-1];
        for(int i = n-2; i >= 0; i--) {
            right[i] = Math.max(right[i+1], nums[i]);
        }
        int i = 0;
        int j = 0;
        int ans = 0;
        while(j < n) {
            while(i < j && nums[i] > right[j]) {
                i++;
            }
            ans = Math.max(ans, j-i);
            j++;
        }
        return ans;
    }
}