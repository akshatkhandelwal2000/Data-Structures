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
    public int minimumEffortPath(int[][] heights) {
        // TC : O(ElogV) = O(M*N log M*N) // SC : O(M*N) + O(M*N)
        int m = heights.length;
        int n = heights[0].length;
        PriorityQueue<Tuple> pq = new PriorityQueue<>((x,y) -> x.distance - y.distance);
        int[][] dist = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                dist[i][j] = (int)1e9;
            }
        }
        dist[0][0] = 0;
        pq.offer(new Tuple(0, 0, 0));
        int[] delrow = {-1,0,1,0};
        int[] delcol = {0,1,0,-1};
        while(!pq.isEmpty()) {
            int diff = pq.peek().distance;
            int row = pq.peek().row;
            int col = pq.peek().col;
            pq.poll();
            if(row == m-1 && col == n-1) return diff;
            for(int i = 0; i < 4; i++) {
                int nrow = row + delrow[i];
                int ncol = col + delcol[i];
                if(nrow >= 0 && nrow < m && ncol >= 0 && ncol < n) {
                    int neweffort = Math.max(Math.abs(heights[row][col] - heights[nrow][ncol]), diff);
                        if(neweffort < dist[nrow][ncol]) {
                            dist[nrow][ncol] = neweffort;
                            pq.add(new Tuple(neweffort, nrow, ncol));
                        }
                    }
                }
            }
            if(dist[m-1][n-1] == (int)(1e9)) return -1;
            return dist[m-1][n-1];
    }
}