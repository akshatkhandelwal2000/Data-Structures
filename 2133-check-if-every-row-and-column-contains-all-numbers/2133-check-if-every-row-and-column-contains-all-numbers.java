class Solution {
    public boolean checkValid(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0; i < m; i++) {
            List<Integer> a = new ArrayList<>();
            List<Integer> b = new ArrayList<>();
            for(int j = 0; j < n; j++) {
                a.add(matrix[i][j]);
                b.add(matrix[j][i]);
            }
            Collections.sort(a);
            Collections.sort(b);
            int c = 1;
            for(int k : a) {
                if(k != c) {
                    return false;
                }
                c++;
            }
            c = 1;
            for(int k : b) {
                if(k != c) {
                    return false;
                }
                c++;
            }
        }
        return true;
    }
}