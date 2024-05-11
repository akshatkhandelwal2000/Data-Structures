class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        // TC : O(M * N) // SC : O(1)
        int m = mat.length;
        int n = mat[0].length;
        int row = 0;
        int one = 0;
        for(int i = 0; i < m; i++) {
            int ones = 0;
            for(int j = 0; j < n; j++) {
                if(mat[i][j] == 1) ones++;
            }
            if(ones > one) {
                one = ones;
                row = i;
            }
            if(ones == one) {
                row = Math.min(row, i);
            }
        }
        return new int[]{row, one};
    }
}