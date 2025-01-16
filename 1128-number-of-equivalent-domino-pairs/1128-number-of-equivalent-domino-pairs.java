class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        // TC : O(N) // SC : O(1)
        int n = dominoes.length;
        int ans = 0;
        int[] a = new int[100];
        for(int i = 0; i < n; i++) {
            int b = Math.min(dominoes[i][0], dominoes[i][1]);
            int c = Math.max(dominoes[i][0], dominoes[i][1]);
            ans += a[b*10+c]++;
        }
        return ans;
    }
}