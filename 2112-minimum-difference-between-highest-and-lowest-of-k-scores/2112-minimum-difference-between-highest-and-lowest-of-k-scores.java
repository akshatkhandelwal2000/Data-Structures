class Solution {
    public int minimumDifference(int[] nums, int k) {
        // TC : O(NlogN) // SC : O(1)
        int n = nums.length;
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        int j = 0;
        for(int i = 0; i < n; i++) {
            if(i-j+1 == k) {
                ans = Math.min(ans, nums[i]-nums[j]);
                j++;
            }
        }
        return ans;
    }
}