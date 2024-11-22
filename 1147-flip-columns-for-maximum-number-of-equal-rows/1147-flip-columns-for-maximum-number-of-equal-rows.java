class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        // TC : O(M*N) // SC : O(M*N)
        int m = matrix.length;
        int n = matrix[0].length;
        int ans = 0;
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < m; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < n; j++) {
                if(matrix[i][0] == matrix[i][j]) {
                    sb.append("T");
                }
                else {
                    sb.append("F");
                }
            }
            map.put(sb.toString(), map.getOrDefault(sb.toString(), 0)+1);
        }
        for(String i : map.keySet()) {
            ans = Math.max(ans, map.get(i));
        }
        return ans;
    }
}
