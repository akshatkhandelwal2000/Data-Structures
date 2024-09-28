class Solution {
    public int minElement(int[] nums) {
        int n = nums.length;
        int score = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            String s = String.valueOf(nums[i]);
            int count = 0;
            int j = 0;
            while(j < s.length()) {
                count += s.charAt(j)-48;
                j++;
            }
            score = Math.min(score, count);
        }
        return score;
    }
}