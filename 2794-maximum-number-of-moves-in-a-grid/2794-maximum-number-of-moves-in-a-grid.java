class Solution {
    public int maxMoves(int[][] grid) {
        // TC : O(M*N) // SC : O(M*N)
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int ans = 0;
        int[] dir = {-1,0,1};
        for(int i = 0; i < m; i++) {
            ans = Math.max(ans, moves(i, 0, grid, dp, dir));
        }
        return ans;
    }
    public int moves(int i, int j, int[][] grid, int[][] dp, int[] dir) {
        if(dp[i][j] != -1) return dp[i][j];
        int moves = 0;
        for(int k = 0; k < 3; k++) {
            int a = i+dir[k];
            int b = j+1;
            if(a >= 0 && b >= 0 && a < grid.length && b < grid[0].length && grid[i][j] < grid[a][b]) {
            moves = Math.max(moves, 1+moves(a, b, grid, dp, dir));
            }
        }
        dp[i][j] = moves;
        return dp[i][j];
    }
}