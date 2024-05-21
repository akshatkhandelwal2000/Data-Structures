class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[] ans = new int[n];
        for(int i = 0; i < n; i++) {
            int start = intervals[i][1];
            int inter = Integer.MAX_VALUE;
            int ind = -1;
            for(int j = 0; j < n; j++) {
                if(intervals[i][1] == intervals[i][0]) {
                    ind = i;
                    break;
                }
                else if(intervals[j][0] >= start && j != i) {
                    if(intervals[j][0] < inter) {
                        inter = intervals[j][0];
                        ind = j;
                    }
                }
            }
            ans[i] = ind;
        }
        return ans;
    }
}