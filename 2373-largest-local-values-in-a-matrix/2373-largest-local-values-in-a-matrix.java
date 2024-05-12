class Solution {
    public int[][] largestLocal(int[][] grid) {
        // TC : O(N * N) // SC : O(N * N)
        int n = grid.length;
        int[][] ans = new int[n-2][n-2];
        for(int i = 0; i < n-2; i++) {
            for(int j = 0; j < n-2; j++) {
                for(int k = i; k < i+3; k++) {
                    for(int l = j; l < j+3; l++) {
                        ans[i][j] = Math.max(ans[i][j], grid[k][l]);
                    }
                }
            }
        }
        return ans;
    }
}