class Solution {
    public int appendCharacters(String s, String t) {
        // TC : O(N) // SC : O(1)
        int n = s.length();
        int m = t.length();
        int in = 0;
        for(int i = 0; i < n; i++) {
            if(in < m && s.charAt(i) == t.charAt(in)) {
                in++;
            }
        }
        return m-in;
    }
}