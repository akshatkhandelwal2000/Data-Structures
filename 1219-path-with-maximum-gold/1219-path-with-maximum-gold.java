class Solution {
    public int getMaximumGold(int[][] grid) {
        // TC : O(M * N * 3 * M * N) // SC : O(M * N)
        int m = grid.length;
        int n = grid[0].length;
        int[] ans = new int[1];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] != 0) {
                    dfs(i, j, m, n, 0, ans, grid);
                }
            }
        }
        return ans[0];
    }
    public void dfs(int i, int j, int m, int n, int cur, int[] ans, int[][] grid) {
        if(i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 0) {
            ans[0] = Math.max(ans[0], cur);
            return;
        }
        int temp = grid[i][j];
        grid[i][j] = 0;
        dfs(i+1, j, m, n, cur+temp, ans, grid);
        dfs(i-1, j, m, n, cur+temp, ans, grid);
        dfs(i, j+1, m, n, cur+temp, ans, grid);
        dfs(i, j-1, m, n, cur+temp, ans, grid);
        grid[i][j] = temp;
    }
}