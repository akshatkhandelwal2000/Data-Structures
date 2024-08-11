class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int[][] grid = new int[n][n];
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                grid[i][j] = cnt;
                cnt++;
            } 
        }
        int ans = grid[0][0];
        int j = 0;
        int k = 0;
        for(int i = 0; i < commands.size(); i++) {
            String s = commands.get(i);
            if(s.equals("RIGHT")) {
                ans = grid[j][k+1];
                k++;
            }
            else if(s.equals("LEFT")) {
                ans = grid[j][k-1];
                k--;
            }
            else if(s.equals("UP")) {
                ans = grid[j-1][k];
                j--;
            }
            else if(s.equals("DOWN")) {
                ans = grid[j+1][k];
                j++;
            }
        }
        return ans;
    }
}