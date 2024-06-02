class Solution {
    public int countDays(int days, int[][] meetings) {
        // TC : O(NlogN) // SC : O(1)
        int n = meetings.length;
        Arrays.sort(meetings, (a,b) -> a[0]-b[0]);
        int ans = Math.abs(meetings[0][0]-1);
        int end = meetings[0][1];
        for(int i = 1; i < n; i++) {
            if(meetings[i][0] > end) {
                ans += meetings[i][0]-end-1;
            }
            end = Math.max(end, meetings[i][1]);
        }
        if(end < days) ans += days-end;
        return ans;
    }
}