class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        // TC : O(N^2) // SC : O(1)
        int n = dominoes.length;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if((dominoes[i][0] == dominoes[j][0] && dominoes[i][1] == dominoes[j][1]) || (dominoes[i][0] == dominoes[j][1] &&
                dominoes[i][1] == dominoes[j][0])) {
                    ans++;
                }
            }
        }
        return ans;
    }
}