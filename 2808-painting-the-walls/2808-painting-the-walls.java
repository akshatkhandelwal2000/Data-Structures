class Solution {
    public int paintWalls(int[] cost, int[] time) {
        // TC : O(N^2) // SC : O(N)
        int n = cost.length;
        int[] money = new int[n+1];
        Arrays.fill(money, (int)1e9);
        money[0] = 0;
        for(int i = 0; i < n; i++) {
            for(int j = n; j > 0; j--) {
                money[j] = Math.min(money[j], money[Math.max(j-time[i]-1, 0)]+cost[i]);
            }
        }
        return money[n];
    }
}