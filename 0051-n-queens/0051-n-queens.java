class Solution {
    public List<List<String>> solveNQueens(int n) {
        // TC : O(N!) * O(N) // SC : O(N*N)
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col < board.length; col++) {
                board[row][col] = '.';
            }
        }
        rec(0, ans, board);
        return ans; 
    }
    public void rec(int col, List<List<String>> ans, char[][] board) {
        if(col == board.length) {
            ans.add(construct(board));
            return;
        }
        for(int row = 0; row < board.length; row++) {
            if(issafe(board, row, col)) {
                board[row][col] = 'Q';
                rec(col+1, ans, board);
                board[row][col] = '.';
            }
        }
    }
    public boolean issafe(char[][] board, int row, int col) {
        int orow = row;
        int ocol = col;
        // up left
        while(row >= 0 && col >= 0) {
            if(board[row][col] == 'Q') return false;
            row--;
            col--;
        }
        row = orow;
        col = ocol;
        // left horizontal
        while(col >= 0) {
            if(board[row][col] == 'Q') return false;
            col--;
        }
        row = orow;
        col = ocol;
        // lower left
        while(col >= 0 && row < board.length) {
            if(board[row][col] == 'Q') return false;
            row++;
            col--;
        }
        return true;
    }
    public List<String> construct(char[][] board) {
        List<String> res = new ArrayList<>();
        for(int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
}