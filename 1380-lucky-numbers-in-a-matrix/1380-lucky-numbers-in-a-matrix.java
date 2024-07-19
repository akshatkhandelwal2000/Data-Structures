class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        // TC : O(M*N*M) // SC : O(M)
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            boolean flag = false;
            int index = -1;
            for(int j = 0; j < n; j++) {
                if(j == n-1) flag = true;
                if(matrix[i][j] < min) {
                    min = matrix[i][j];
                    index = j;
                }
                if(flag) {
                    for(int k = 0; k < m; k++) {
                        max = Math.max(max, matrix[k][index]);
                    }
                }
            }
            if(min == max) ans.add(min);
        }
        return ans;
    }
}