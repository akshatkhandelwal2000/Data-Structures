class Solution {
    public int countWays(int[][] ranges) {
        // TC : O(N log N) // SC : O(1)
        int n = ranges.length;
        Arrays.sort(ranges, (x,y) -> x[0] - y[0]);
        int mod = (int)1e9+7;
        int ans = 2;
        int last = ranges[0][1];
        for(int i = 1; i < n; i++) {
            if(ranges[i][0] > last) {
                ans = (ans * 2) % mod;
            }
            last = Math.max(last, ranges[i][1]);
        }
        return ans;
    }
}