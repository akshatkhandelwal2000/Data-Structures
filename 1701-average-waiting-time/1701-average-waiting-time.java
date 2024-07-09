class Solution {
    public double averageWaitingTime(int[][] customers) {
        // TC : O(N) // SC : O(1)
        int n = customers.length;
        double ans = 0;
        long time = customers[0][0];
        time += customers[0][1];
        ans += time-customers[0][0];
        for(int i = 1; i < n; i++) {
            if(customers[i][0] <= time) {
                time += customers[i][1];
                ans += time-customers[i][0];
            }
            else {
                int j = customers[i][0];
                j += customers[i][1];
                time = Math.max(time, j);
                ans += j-customers[i][0];
            }
        }
        return ans/(n*1.0);
    }
}