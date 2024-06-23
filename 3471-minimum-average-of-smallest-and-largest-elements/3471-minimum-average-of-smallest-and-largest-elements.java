class Solution {
    public double minimumAverage(int[] nums) {
        // TC : O(NlogN) // SC : O(1)
        int n = nums.length;
        Arrays.sort(nums);
        double min = Double.MAX_VALUE;
        for(int i = 0; i < n/2; i++) {
            double num = (nums[i]+nums[n-i-1])/2.0;
            min = Math.min(min, num);
        }
        return min;
    }
}