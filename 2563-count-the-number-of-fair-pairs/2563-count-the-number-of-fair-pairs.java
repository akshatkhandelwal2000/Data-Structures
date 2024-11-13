class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        // TC : O(NlogN) // SC : O(1)
        int n = nums.length;
        Arrays.sort(nums);
        long ans = 0;
        for(int i = 0; i < n; i++) {
            long low = lowerbound(nums, i+1, n-1, lower-nums[i]);
            long high = lowerbound(nums, i+1, n-1, upper-nums[i]+1);
            ans += 1*(high-low);
        }
        return ans;
    }
    public int lowerbound(int[] nums, int low, int high, int a) {
        while(low <= high) {
            int mid = low+(high-low)/2;
            if(nums[mid] >= a) {
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return low;
    }
}