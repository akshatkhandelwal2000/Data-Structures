class Solution {
    public int minFlips(int[][] grid) {
        // TC : O(M+N) + O(M+N) // SC : O(1)
        int m = grid.length;
        int n = grid[0].length;
        if(m <= 2 && n == 0) return 0;
        int ans = 0;
        int ans2 = 0;
        for(int i = 0; i < m; i++) {
            int j = i;
            int k = 0;
            int l = n-1;
            while(k < l) {
                if(grid[j][k] != grid[j][l]) {
                    ans++;
                }
                k++;
                l--;
            }
        }
        for(int i = 0; i < n; i++) {
            int j = i;
            int k = 0;
            int l = m-1;
            while(k < l) {
                if(grid[k][j] != grid[l][j]) {
                    ans2++;
                }
                k++;
                l--;
            }
        }
        return Math.min(ans, ans2);
    }
}