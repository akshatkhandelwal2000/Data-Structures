class Solution {
    public int minimumTime(int[][] grid) {
        // TC : O(M*N) log (M*N) // SC : O(M*N)
        if(grid[0][1] > 1 && grid[1][0] > 1) {
            return -1;
        }
        int m = grid.length;
        int n = grid[0].length;
        int[][] vis = new int[m][n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[2]-b[2]);
        pq.offer(new int[]{0,0,0});
        int[] delrow = {0,1,0,-1};
        int[] delcol = {1,0,-1,0};
        while(!pq.isEmpty()) {
            int row = pq.peek()[0];
            int col = pq.peek()[1];
            int time = pq.peek()[2];
            pq.poll();
            if(row == m-1 && col == n-1) {
                return time;
            }
            if(vis[row][col] == 1) {
                continue;
            }
            vis[row][col] = 1;
            for(int i = 0; i < 4; i++) {
                int nrow = row+delrow[i];
                int ncol = col+delcol[i];
                if(nrow >= 0 && nrow < m && ncol >= 0 && ncol < n) {
                    if(grid[nrow][ncol] <= time+1) {
                        pq.offer(new int[]{nrow, ncol, time+1});
                    }
                    else {
                        int diff = grid[nrow][ncol]-time;
                        if(diff%2 == 1) {
                            pq.offer(new int[]{nrow, ncol, grid[nrow][ncol]});
                        }
                        else {
                            pq.offer(new int[]{nrow, ncol, grid[nrow][ncol]+1});
                        }
                    } 
                }
            }
        }
        return -1;
    }
}