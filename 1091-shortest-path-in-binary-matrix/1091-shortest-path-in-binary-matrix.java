class Solution {
    class Tuple {
        int distance;
        int row;
        int col;
        public Tuple(int distance, int row, int col) {
            this.distance = distance;
            this.row = row;
            this.col = col;
        }
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        // TC : O(N*N) + O(N*N*8) // SC : O(N*N) + O(N*N) 
        int n = grid.length;
        if(grid[0][0] == 1 || grid[n-1][n-1] == 1) return -1;
        if(n == 1 && grid[n-1][n-1] == 0) return 1;
        Queue<Tuple> q = new LinkedList<>();
        int[][] dist = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                dist[i][j] = (int)(1e9);
            }
        }
        dist[0][0] = 1;
        q.offer(new Tuple(1, 0, 0));
        while(!q.isEmpty()) {
            int dis = q.peek().distance;
            int row = q.peek().row;
            int col = q.peek().col;
            q.poll();
            int[] delrow = {-1,0,1,0,-1,1,1,-1};
            int[] delcol = {0,1,0,-1,1,1,-1,-1};
            for(int i = 0; i < 8; i++) {
                int nrow = row + delrow[i];
                int ncol = col + delcol[i];
                if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < n && 
                grid[nrow][ncol] == 0 && 1+dis < dist[nrow][ncol]) {
                    if(nrow == n-1 && ncol == n-1) return 1+dis;
                    dist[nrow][ncol] = 1+dis;
                    q.add(new Tuple(1+dis, nrow, ncol));
                }
            }
        }
        return -1;
    }
}