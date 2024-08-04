class neighborSum {
    int[][] gri;
    public neighborSum(int[][] grid) {
        gri = new int[grid.length][grid.length];
        gri = grid;
    }
    
    public int adjacentSum(int value) {
        // TC : O(N^2) // SC : O(1)
        int sum = 0;
        for(int i = 0; i < gri.length; i++) {
            for(int j = 0; j < gri[0].length; j++) {
                if(gri[i][j] == value) {
                    if(i > 0) {
                        sum += gri[i-1][j];
                    }
                    if(j > 0) {
                        sum += gri[i][j-1];
                    }
                    if(i < gri.length-1) {
                        sum += gri[i+1][j];
                    }
                    if(j < gri[0].length-1) {
                        sum += gri[i][j+1];
                    }
                    return sum;
                }
            }
        }
        return sum;
    }
    
    public int diagonalSum(int value) {
        // TC : O(N^2) // SC : O(1)
        int sum = 0;
        for(int i = 0; i < gri.length; i++) {
            for(int j = 0; j < gri[0].length; j++) {
                if(gri[i][j] == value) {
                    if(i > 0 && j > 0) {
                        sum += gri[i-1][j-1];
                    }
                    if(i > 0 && j < gri[0].length-1) {
                        sum += gri[i-1][j+1];
                    }
                    if(i < gri.length-1 && j < gri[0].length-1) {
                        sum += gri[i+1][j+1];
                    }
                    if(i < gri.length-1 && j > 0) {
                        sum += gri[i+1][j-1];
                    }
                    return sum;
                }
            }
        }
        return sum;
    }
}

/**
 * Your neighborSum object will be instantiated and called as such:
 * neighborSum obj = new neighborSum(grid);
 * int param_1 = obj.adjacentSum(value);
 * int param_2 = obj.diagonalSum(value);
 */