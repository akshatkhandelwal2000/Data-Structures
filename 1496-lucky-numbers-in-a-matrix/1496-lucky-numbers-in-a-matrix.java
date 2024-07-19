class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        // TC : O(M*N) // SC : O(M+N)
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        int[] row = new int[m];
        int[] col = new int[n];
        for(int i = 0; i < m; i++) {
            int min = Integer.MAX_VALUE;
            for(int j = 0; j < n; j++) {
                min = Math.min(min, matrix[i][j]);
            }
            row[i] = min;
        }
        for(int i = 0; i < n; i++) {
            int max = Integer.MIN_VALUE;
            for(int j = 0; j < m; j++) {
                max = Math.max(max, matrix[j][i]);
            }
            col[i] = max;
        }
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(row[i] == matrix[i][j] && 
                   col[j] == matrix[i][j]) ans.add(matrix[i][j]);
            }
        }
        return ans;
    }
}