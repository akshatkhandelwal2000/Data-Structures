class Solution {
    public int findChampion(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] ans = new int[n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 1) {
                    ans[i]++;
                }
            }
        }
        int cha = 0;
        int max = 0;
        for(int i = 0; i < n; i++) {
            if(ans[i] > max) {
                max = ans[i];
                cha = i;
            }
        }
        return cha;
    }
}