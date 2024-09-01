class Solution {
    public String stringHash(String s, int k) {
        // TC : O(N) // SC : O(1)
        int n = s.length();
        String ans = "";
        int j = 0;
        while(j < n) {
            int len = 0;
            int hashed = 0;
            while(j < n && len < k) {
                hashed += s.charAt(j)-'a';
                j++;
                len++;
            }
            hashed = hashed%26;
            ans += (char)(hashed+97);
        }
        return ans;
    }
}