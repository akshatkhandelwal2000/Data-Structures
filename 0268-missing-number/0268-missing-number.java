class Solution {
    public int missingNumber(int[] nums) {
        // TC : O(N) // SC : O(1)
        int sum = 0;
        int n = nums.length;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return n*(n +1)/2 - sum;
        // Using XOR
        // TC : O(N) // SC : O(1)
        // int res = nums.length;
        // for(int i = 0; i < nums.length; i++) {
        //     res ^= i;
        //     res ^= nums[i];
        // }
        // return res;
    }
}