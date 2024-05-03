class Solution {
    public int[] divisibilityArray(String word, int m) {
        // TC : O(N) // SC : O(N)
        int n = word.length();
        int[] ans = new int[n];
        long v = 0;
        for(int i = 0; i < n; i++) {
            v = (v * 10 + (word.charAt(i)-'0')) % m;
            if(v == 0) {
                ans[i] = 1;
            }
            else {
                ans[i] = 0;
            }
        }
        return ans;
    }
}