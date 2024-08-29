class Solution {
    public int minimumDifference(int[] nums, int k) {
        // TC : O(NlogN) // SC : O(1)
        int n = nums.length;
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            if(i+k-1 >= n) break;
            ans = Math.min(ans, nums[i+k-1]-nums[i]);
        }
        return ans;
    }
}