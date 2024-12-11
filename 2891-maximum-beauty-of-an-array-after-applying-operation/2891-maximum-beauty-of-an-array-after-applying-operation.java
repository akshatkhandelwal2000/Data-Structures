class Solution {
    public int maximumBeauty(int[] nums, int k) {
        // TC : O(NlogN) // SC : O(NlogN)
        Arrays.sort(nums);
        int j = 0, i = 0;
        for(j = 0; j < nums.length; j++) {
            if(nums[j] - nums[i]> k*2) {
                i++;
            }
        }
        return j-i;
    }
}