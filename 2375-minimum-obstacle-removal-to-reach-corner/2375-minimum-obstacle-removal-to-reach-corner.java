class Solution {
    public int minimumObstacles(int[][] grid) {
        // TC : O(M*N) // SC : O(M*N)
        int m = grid.length;
        int n = grid[0].length;
        int[][] dis = new int[m][n];
        for(int[] i : dis) {
            Arrays.fill(i, Integer.MAX_VALUE);
        }
        Deque<int[]> q = new ArrayDeque<>();
        dis[0][0] = 0;
        q.offerFirst(new int[]{0,0,0});
        int[] delrow = {0,1,0,-1};
        int[] delcol = {1,0,-1,0};
        while(!q.isEmpty()) {
            int[] a = q.pollFirst();
            int row = a[0];
            int col = a[1];
            int dist = a[2];
            for(int i = 0; i < 4; i++) {
                int nrow = row+delrow[i];
                int ncol = col+delcol[i];
                if(nrow >= 0 && nrow < m && ncol >= 0 && ncol < n) {
                    int b = dist+grid[nrow][ncol];
                    if(b < dis[nrow][ncol]) {
                        dis[nrow][ncol] = b;
                        if(grid[nrow][ncol] == 0) {
                            q.offerFirst(new int[]{nrow, ncol, b});
                        }
                        else {
                            q.offerLast(new int[]{nrow, ncol, b});
                        }
                    }
                }
            }
        }
        return dis[m-1][n-1];
    }
}