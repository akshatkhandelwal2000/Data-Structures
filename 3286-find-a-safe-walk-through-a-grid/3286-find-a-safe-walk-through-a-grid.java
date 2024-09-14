class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        // TC : O(M*N*4) // SC : O(M*N)
        int m = grid.size();
        int n = grid.get(0).size();
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0, health-grid.get(0).get(0)});
        int[][] mat = new int[m][n];
        for(int[] i : mat) {
            Arrays.fill(i, -1);
        }
        mat[0][0] = health-grid.get(0).get(0);
        int[] delrow = {-1,0,1,0};
        int[] delcol = {0,1,0,-1};
        while(!q.isEmpty()) {
            int row = q.peek()[0];
            int col = q.peek()[1];
            int h = q.peek()[2];
            q.poll();
            if(row == m-1 && col == n-1 && h > 0) return true;
            for(int i = 0; i < 4; i++) {
                int nrow = row+delrow[i];
                int ncol = col+delcol[i];
                if(nrow >= 0 && nrow < m && ncol >= 0 && ncol < n) {
                    int nh = h - grid.get(nrow).get(ncol);
                    if(nh > 0 && nh > mat[nrow][ncol]) {
                        mat[nrow][ncol] = nh;
                        q.offer(new int[]{nrow, ncol, nh});
                    }
                }
            }
        }
        return false;
    }
}