class Solution {
    public String losingPlayer(int x, int y) {
        // TC : O(Y/4) // SC : O(1)
        boolean flag = false;
        while(x >= 1 && y >= 4) {
            flag = true;
            x--;
            y-=4;
            if(x >= 1 && y >= 4) {
                flag = false;
            }
            x--;
            y-=4;
        }
        return flag == false ? "Bob" : "Alice";
    }
}