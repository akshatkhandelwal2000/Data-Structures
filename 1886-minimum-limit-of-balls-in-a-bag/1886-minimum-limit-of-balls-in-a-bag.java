class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        // TC : O(N*logM) // SC : O(1)
        int n = nums.length;
        int max = 0;
        for(int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
        }
        int low = 1;
        int high = max;
        while(low < high) {
            int mid = (low+high)/2;
            int a = 0;
            for(int i : nums) {
                a += (i-1)/mid;
            }
            if(a <= maxOperations) {
                high = mid;
            }
            else {
                low = mid+1;
            }
        }
        return high;
    }
}