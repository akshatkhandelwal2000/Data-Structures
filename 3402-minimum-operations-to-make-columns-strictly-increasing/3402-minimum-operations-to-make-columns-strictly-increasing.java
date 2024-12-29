class Solution {
    public int minimumOperations(int[][] grid) {
        // TC : O(M*N) // SC : O(1)
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 1; j < m; j++) {
                if(grid[j][i] <= grid[j-1][i]) {
                    ans += grid[j-1][i]-grid[j][i]+1;
                    grid[j][i] = grid[j-1][i]+1;
                }
            }
        }
        return ans;
    }
}