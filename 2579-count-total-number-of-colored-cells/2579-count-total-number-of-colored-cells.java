class Solution {
    public long coloredCells(int n) {
        // TC : O(N) // SC : O(1)
        if(n == 1) return 1;
        long ans = 1;
        int i = n;
        while(i != 1) {
            ans += n * 2;
            i--;
        }
        return ans;
    }
}