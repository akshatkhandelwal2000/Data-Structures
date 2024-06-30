class Solution {
    public int maximumLength(int[] nums) {
        // TC : O(N) // SC : O(1)
        int n = nums.length;
        int even = 0;
        int odd = 0;
        int evenodd = 0;
        int r = nums[0]%2;
        for(int i = 0; i < n; i++) {
            if(nums[i]%2 == 0) {
                even++;
            }
            if(nums[i]%2 == 1) {
                odd++;
            }
            if(nums[i]%2 == r) {
                evenodd++;
                r = 1-r; 
            } 
        }
        return Math.max(evenodd, Math.max(even, odd));
    }
}