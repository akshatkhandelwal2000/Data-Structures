class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        // TC : O(3*M*N) // SC : O(1)
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        for(int i = 0; i <= m-3; i++) {
            for(int j = 0; j <= n-3; j++) {
                if(isMagicSquare(grid, i, j)) ans++;
            }
        }
        return ans;
    }
    public boolean isMagicSquare(int[][] grid, int row, int col) {
        int[] rowSum = new int[3];
        int[] colSum = new int[3];
        int diagSum = 0;
        int diagSum2 = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                int sum = grid[row+i][col+j];
                if(sum < 1 || sum > 9 || set.contains(sum)) {
                    return false;
                }
                set.add(sum);
                rowSum[i] += sum;
                colSum[j] += sum;
                if(i == j) diagSum += sum;
                if(i+j == 2) diagSum2 += sum; 
            }
        }
        if(rowSum[0] != rowSum[1] || rowSum[1] != rowSum[2]) return false;
        if(colSum[0] != colSum[1] || colSum[1] != colSum[2]) return false;
        if(diagSum != diagSum2) return false;
        return true;
    }
}