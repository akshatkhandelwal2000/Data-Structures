class Solution {
    public int[] findPeakGrid(int[][] mat) {
        // TC : O(M*N) // SC : O(1)
        int m = mat.length;
        int n = mat[0].length;
        int max = Integer.MIN_VALUE;
        int x = -1;
        int y = -1;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(mat[i][j] > max) {
                    max = mat[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        return new int[]{x,y};
        // TC : O(M*N) // SC : O(1)
        // for(int i = 0; i < m; i++) {
        //     for(int j = 0; j < n; j++) {
        //         boolean flag = true;
        //         if(i > 0) {
        //             if(mat[i-1][j] > mat[i][j]) {
        //                 flag = false;
        //             }
        //         }
        //         if(j > 0) {
        //             if(mat[i][j-1] > mat[i][j]) {
        //                 flag = false;
        //             }
        //         }
        //         if(i < m-1) {
        //             if(mat[i+1][j] > mat[i][j]) {
        //                 flag = false;
        //             }
        //         }
        //         if(j < n-1) {
        //             if(mat[i][j+1] > mat[i][j]) {
        //                 flag = false;
        //             }
        //         }
        //         if(flag) return new int[]{i,j};
        //     }
        // }
        // return new int[]{-1,-1};
    }
}