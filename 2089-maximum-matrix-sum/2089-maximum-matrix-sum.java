class Solution {
    public long maxMatrixSum(int[][] matrix) {
        // TC : O(M*N) // SC : O(1)
        int m = matrix.length;
        int n = matrix[0].length;
        long ans = 0;
        int count = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                ans += Math.abs(matrix[i][j]);
                min = Math.min(min, Math.abs(matrix[i][j]));
                if(matrix[i][j] < 0) {
                    count++;
                }
            }
        }
        if(count%2 == 0) {
            return ans;
        }
        ans = ans-min;
        return ans-min;
    }
}