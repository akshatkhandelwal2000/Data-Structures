class Solution {
    public int maxNumOfMarkedIndices(int[] nums) {
        // TC : O(NlogN) // SC : O(1)
        int n = nums.length;
        Arrays.sort(nums);
        int ans = 0;
        int j = 0;
        for(int i = n/2; i < n; i++) {
            long v = 2*nums[j];
            if(v <= nums[i] && j < n/2) {
                j++;
                ans += 2;
            }
        }
        return ans;
    }
}