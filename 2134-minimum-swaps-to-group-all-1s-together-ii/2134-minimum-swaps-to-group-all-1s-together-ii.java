class Solution {
    public int minSwaps(int[] nums) {
        // TC : O(N) // SC : O(1)
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int ones = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] == 1) ones++;
        }
        int i = 0;
        int j = 0;
        int sum = 0;
        while(j < 2*n) {
            sum += nums[j%n];
            while(j-i+1 == ones) {
                max = Math.max(max, sum);
                sum -= nums[i%n];
                i++;
            }
            j++;
        }
        return ones-max;
    }
}