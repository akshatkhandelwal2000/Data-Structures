class Solution {
    public boolean doesAliceWin(String s) {
        // TC : O(N) // SC : O(1)
        int n = s.length();
        for(int i = 0; i < n; i++) {
            if(isVowel(s.charAt(i))) return true;
        }
        return false;
    }
    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}