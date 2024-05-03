class Solution {
    class Triplet {
        int time;
        int row;
        int col;
        public Triplet(int time, int row, int col) {
            this.time = time;
            this.row = row;
            this.col = col;
        }
    }
    public int minimumTime(int[][] grid) {
        // TC : O((M * N) log (M * N)) // SC : O(M*N)
        if(grid[0][1] > 1 && grid[1][0] > 1) return -1;
        int m = grid.length;
        int n = grid[0].length;
        PriorityQueue<Triplet> pq = new PriorityQueue<>((x,y) -> x.time-y.time);
        int[][] vis = new int[m][n];
        int[] delrow = {-1,0,1,0};
        int[] delcol = {0,1,0,-1};
        pq.offer(new Triplet(0, 0, 0));
        while(!pq.isEmpty()) {
            int time = pq.peek().time;
            int row = pq.peek().row;
            int col = pq.peek().col;
            pq.poll();
            if(row == m-1 && col == n-1) return time;
            if(vis[row][col] == 1) continue;
            vis[row][col] = 1;
            for(int i = 0; i < 4; i++) {
                int nrow = row + delrow[i];
                int ncol = col + delcol[i];
                if(nrow >= 0 && nrow < m && ncol >= 0 && ncol < n && vis[nrow][ncol] == 0) {
                    if(grid[nrow][ncol] <= time+1) {
                        pq.offer(new Triplet(time+1, nrow, ncol));
                    }
                    else {
                        int diff = grid[nrow][ncol] - time;
                        if(diff % 2 == 1) {
                            pq.offer(new Triplet(grid[nrow][ncol], nrow, ncol));
                        }
                        else {
                            pq.offer(new Triplet(grid[nrow][ncol]+1, nrow, ncol));
                        }
                    }
                }
            }
        }
        return -1;
    }
}