class Solution {
    public int differenceOfSum(int[] nums) {
        // TC : O(N) // SC : O(1)
        int n = nums.length;
        int ans = 0;
        int a = 0;
        int b = 0;
        for(int i = 0; i < n; i++) {
            a += nums[i];
            while(nums[i] != 0) {
                b += nums[i]%10;
                nums[i] = nums[i]/10;
            }
        }
        return Math.abs(a-b);
    }
}