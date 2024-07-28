class Solution {
    public boolean canAliceWin(int[] nums) {
        // TC : O(N) // SC : O(1)
        int n = nums.length;
        int doubleDigitSum = 0;
        int singleDigitSum = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] > 9) {
                doubleDigitSum += nums[i];
            }
            else {
                singleDigitSum += nums[i];
            }
        }
        if(doubleDigitSum != singleDigitSum) {
            return true;
        }
        return false;
    }
}