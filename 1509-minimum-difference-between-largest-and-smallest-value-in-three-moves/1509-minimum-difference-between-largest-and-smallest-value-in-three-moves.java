class Solution {
    public int minDifference(int[] nums) {
        // TC : O(NlogN) // SC : O(1)
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        if(n <= 4) return 0;
        Arrays.sort(nums);
        for(int i = 0; i < 4; i++) {
            ans = Math.min(ans, nums[n-4+i]-nums[i]);
        }
        return ans;
    }
}