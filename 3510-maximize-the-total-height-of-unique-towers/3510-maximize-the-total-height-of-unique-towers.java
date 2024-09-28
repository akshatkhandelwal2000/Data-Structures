class Solution {
    public long maximumTotalSum(int[] maximumHeight) {
        int n = maximumHeight.length;
        Arrays.sort(maximumHeight);
        long score = 0;
        int min = Integer.MAX_VALUE;
        for(int i = n-1; i >= 0; i--) {
            min = Math.min(min, maximumHeight[i]);
            if(min < 1) {
                return -1;
            }
            score += min;
            min--;
        }
        return score;
    }
}