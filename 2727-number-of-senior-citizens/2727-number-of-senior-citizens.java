class Solution {
    public int countSeniors(String[] details) {
        // TC : O(N) // SC : O(1)
        int n = details.length;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            String s = details[i];
            if(s.charAt(11) == '6' && s.charAt(12) > '0') {
                ans++;
            }
            else if(s.charAt(11) > '6') {
                ans++;
            }
        }
        return ans;
    }
}