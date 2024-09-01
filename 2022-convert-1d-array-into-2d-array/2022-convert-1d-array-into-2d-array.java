class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        // TC : O(M*N) // SC : O(M*N)
        int n1 = original.length;
        if(m*n != n1) return new int[][]{};
        int[][] ans = new int[m][n];
        int in = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                ans[i][j] = original[in++];
            }
        }
        return ans;
    }
}