class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        // TC : O(M*N*4) // SC : O(M*N) 
        int m = grid2.length;
        int n = grid2[0].length;
        boolean[][] vis = new boolean[m][n];
        int ans = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                int[] check = new int[1];
                if(grid2[i][j] == 1 && vis[i][j] == false) {
                    dfs(i, j, vis, grid1, grid2, check);
                    if(check[0] == 0) ans++;
                }
            }
        }
        return ans;
    }
    public void dfs(int row, int col, boolean[][] vis, int[][] grid1, int[][] grid2, int[] check) {
        vis[row][col] = true;
        if(grid1[row][col] == 0) check[0] = -1;
        int m = grid2.length;
        int n = grid2[0].length;
        int[] delrow = {-1,0,1,0};
        int[] delcol = {0,1,0,-1};
        for(int k = 0; k < 4; k++) {
            int nrow = row+delrow[k];
            int ncol = col+delcol[k];
            if(nrow >= 0 && nrow < m && ncol >= 0 && ncol < n && grid2[nrow][ncol] == 1 && vis[nrow][ncol] == false) {
                dfs(nrow, ncol, vis, grid1, grid2, check);
            }
        }
    }
}