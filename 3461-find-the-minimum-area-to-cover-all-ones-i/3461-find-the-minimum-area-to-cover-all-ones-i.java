class Solution {
    public int minimumArea(int[][] grid) {
        // TC : O(M*N) + O(M*N) // SC : O(1)
        int m = grid.length;
        int n = grid[0].length;
        int rowmax = 0;
        int colmax = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 1) {
                    rowmax = Math.max(rowmax, i);
                    colmax = Math.max(colmax, j);
                }
            } 
        }
        int ans = 0;
        int rowheight = 0;
        int maxwidth = 0;
        boolean flag = false;
        for(int i = 0; i < m; i++) {
            boolean flag2 = false;
            int colwidth = 0;
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 1) {
                    flag = true;
                }
                if(grid[i][j] == 1) {
                    flag2 = true;
                    colwidth++;
                }
                if(flag2 && grid[i][j] == 0 && j <= colmax) {
                    colwidth++;
                }
            }
            if(flag && i <= rowmax) rowheight++;
            maxwidth = Math.max(maxwidth, colwidth);
        }
        ans = (rowheight)*(maxwidth);
        return ans;
    }
}