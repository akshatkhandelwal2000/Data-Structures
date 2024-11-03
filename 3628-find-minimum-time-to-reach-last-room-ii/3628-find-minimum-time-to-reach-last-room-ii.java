class Solution {
    public int minTimeToReach(int[][] moveTime) {
        // TC : O(M*N*4) // SC : O(M*N)
        int m = moveTime.length;
        int n = moveTime[0].length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[2]-b[2]);
        pq.offer(new int[]{0,0,0,1});
        int[][] dis = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                dis[i][j] = Integer.MAX_VALUE;
            }
        }
        int[] delrow = {-1,0,1,0};
        int[] delcol = {0,1,0,-1};
        dis[0][0] = 0;
        while(!pq.isEmpty()) {
            int row = pq.peek()[0];
            int col = pq.peek()[1];
            int a = pq.peek()[2];
            int seconds = pq.peek()[3];
            pq.poll();
            if(row == m-1 && col == n-1) {
                return a;
            }
            for(int i = 0; i < 4; i++) {
                int nrow = row+delrow[i];
                int ncol = col+delcol[i];
                if(nrow >= 0 && ncol >= 0 && nrow < m && ncol < n) {
                    int time = Math.max(a, moveTime[nrow][ncol])+seconds;
                    if(dis[nrow][ncol] > time) {
                        dis[nrow][ncol] = time;
                        pq.offer(new int[]{nrow, ncol, dis[nrow][ncol], seconds == 1 ? 2 : 1});
                    }
                }
            }
        }
        return dis[m-1][n-1];
    }
}