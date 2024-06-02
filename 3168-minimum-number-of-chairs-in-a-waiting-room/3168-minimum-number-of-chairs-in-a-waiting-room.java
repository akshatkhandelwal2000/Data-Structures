class Solution {
    public int minimumChairs(String s) {
        // TC : O(N) // SC : O(1)
        int n = s.length();
        int ans = 0;
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == 'E') {
                count++;
            }
            else count--;
            ans = Math.max(ans, count);
        }
        return ans;
    }
}