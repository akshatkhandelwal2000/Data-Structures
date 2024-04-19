class Solution {
    public int numIslands(char[][] grid) {
        // TC : O(M*N) + O(M*N*4) // SC : O(M*N) + O(M*N)
        int m = grid.length;
        int n = grid[0].length;
        int[][] vis = new int[m][n];
        int cnt = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(vis[i][j] == 0 && grid[i][j] == '1') {
                    cnt++;
                    dfs(i, j, vis, grid);
                }
            }
        }
        return cnt;
    }
    public void dfs(int row, int col, int[][] vis, char[][] grid) {
        vis[row][col] = 1;
        int m = grid.length;
        int n = grid[0].length;
        int[] delrow = {-1,0,1,0};
        int[] delcol = {0,1,0,-1};
        for(int i = 0; i < 4; i++) {
            int nrow = row + delrow[i];
            int ncol = col + delcol[i];
            if(nrow >= 0 && nrow < m && ncol >= 0 && ncol < n && vis[nrow][ncol] == 0 && grid[nrow][ncol] == '1') {
                dfs(nrow, ncol, vis, grid);
            }
        }
    }
}


// class Solution {
//     public int numIslands(char[][] grid) {
//         // TC : O(M*N) + O(M*N*4) // SC : O(M*N) + O(M*N)
//         int m = grid.length;
//         int n = grid[0].length;
//         int[][] vis = new int[m][n];
//         int cnt = 0;
//         for(int i = 0; i < m; i++) {
//             for(int j = 0; j < n; j++) {
//                 if(vis[i][j] == 0 && grid[i][j] == '1') {
//                     cnt++;
//                     bfs(i, j, vis, grid);
//                 }
//             }
//         }
//         return cnt;
//     }
//     public void bfs(int i, int j, int[][] vis, char[][] grid) {
//         int m = grid.length;
//         int n = grid[0].length;
//         int[] delrow = {-1,0,1,0};
//         int[] delcol = {0,1,0,-1};
//         Queue<int[]> q = new LinkedList<>();
//         q.offer(new int[]{i, j});
//         vis[i][j] = 1;
//         while(!q.isEmpty()) {
//             int row = q.peek()[0];
//             int col = q.peek()[1];
//             q.poll();
//             for(int k = 0; k < 4; k++) {
//                 int nrow = row + delrow[k];
//                 int ncol = col + delcol[k]; 
//                 if(nrow >= 0 && nrow < m && ncol >= 0 && ncol < n && vis[nrow][ncol] == 0 && grid[nrow][ncol] == '1') {
//                     vis[nrow][ncol] = 1;
//                     q.offer(new int[]{nrow, ncol});
//                 }
//             }
//         }
//     }
// }