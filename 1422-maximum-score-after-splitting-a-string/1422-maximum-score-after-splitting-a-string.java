class Solution {
    public int maxScore(String s) {
        // TC : O(N) // SC : O(1)
        int n = s.length();
        int ans = 0;
        int a = 0;
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == '1') {
                a++;
            }
        }
        int b = 0;
        for(int i = 0; i < n-1; i++) {
            if(s.charAt(i) == '1') {
                a--;
            }
            else {
                b++;
            }
            ans = Math.max(ans, a+b);
        }
        return ans;
    }
}