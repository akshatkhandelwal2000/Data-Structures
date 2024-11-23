class Solution {
    public char[][] rotateTheBox(char[][] box) {
        // TC : O(M*N) // SC : O(M*N)
        int m = box.length;
        int n = box[0].length;
        char[][] ans = new char[n][m];
        for(int i = 0; i < m; i++) {
            int k = n-1;
            for(int j = n-1; j >= 0; j--) {
                if(box[i][j] == '*') {
                    k = j-1;
                }
                if(box[i][j] == '#') {
                    box[i][j] = '.';
                    box[i][k] = '#';
                    k--;
                }
            }
        }
        for(int i = 0; i < m; i++) {
            for(int j = n-1; j >= 0; j--) {
                ans[j][m-i-1] = box[i][j];
            }
        }
        return ans;
    }
}