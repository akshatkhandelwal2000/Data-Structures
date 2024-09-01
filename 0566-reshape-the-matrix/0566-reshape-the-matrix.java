class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        // TC : O(M*N) // SC : O(M*N)
        if(mat[0].length*mat.length != r*c) {
            return mat;
        }
        int[][] ans = new int[r][c]; 
        int m = mat.length;
        int n = mat[0].length;
        int row = 0;
        int col = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                ans[row][col] = mat[i][j];
                col++;
                if(col == c) {
                    row++;
                    col = 0;
                }
            }
        }
        return ans;
    }
}