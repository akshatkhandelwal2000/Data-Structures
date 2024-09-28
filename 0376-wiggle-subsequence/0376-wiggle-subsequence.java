class Solution {
    public int wiggleMaxLength(int[] nums) {
        int n = nums.length;
        int wiggle = 0;
        int score = 0;
        for(int i = 0; i < n-1; i++) {
            if(nums[i] < nums[i+1]) {
                if(wiggle == 0) {
                    score++;
                    wiggle = 1;
                }
            }
            else if(nums[i] > nums[i+1]) {
                if(wiggle == 1) {
                    score++;
                    wiggle = 0;
                }
            }
        }
        return score+1;
    }
}