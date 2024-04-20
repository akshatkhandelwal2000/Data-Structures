class Solution {
    public int[][] findFarmland(int[][] land) {
        // TC : O(M*N) + O(M*N*4) + O(list.size()) // SC : O(list size) + O(M*N) + O(4) + O(M*N)
        List<List<Integer>> list = new ArrayList<>();
        int m = land.length;
        int n = land[0].length;
        int[][] copyland = land;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                List<Integer> temp = new ArrayList<>(); 
                if(copyland[i][j] == 1) {
                    temp.add(i);
                    temp.add(j);
                    bfs(i, j, copyland, temp);
                    list.add(temp);
                }
            }
        }
        int[][] mat = new int[list.size()][4];
        for(int i = 0; i < list.size(); i++) {
            for(int j = 0; j < list.get(i).size(); j++) {
                mat[i][j] = list.get(i).get(j);
            }
        }
        return mat;
    }
    public void bfs(int i, int j, int[][] copyland, List<Integer> temp) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i, j});
        copyland[i][j] = -1;
        int m = copyland.length;
        int n = copyland[0].length;
        int[] delrow = {-1,0,1,0};
        int[] delcol = {0,1,0,-1};
        int maxrow = 0;
        int maxcol = 0;
        while(!q.isEmpty()) {
            int row = q.peek()[0];
            int col = q.peek()[1];
            maxrow = Math.max(maxrow, row);
            maxcol = Math.max(maxcol, col);
            q.poll();
            for(int k = 0; k < 4; k++) {
                int nrow = row + delrow[k];
                int ncol = col + delcol[k];
                if(nrow >= 0 && nrow < m && ncol >= 0 && ncol < n && copyland[nrow][ncol] == 1) {
                    copyland[nrow][ncol] = -1;
                    q.add(new int[]{nrow, ncol});
                }
            }
        }
        temp.add(maxrow);
        temp.add(maxcol);
    }
}