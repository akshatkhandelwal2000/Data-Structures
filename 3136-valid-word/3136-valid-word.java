class Solution {
    public boolean isValid(String word) {
        // TC : O(20) // SC : O(1)
        int n = word.length();
        if(n < 3) return false;
        int in = 0;
        int nv = 0;
        for(int i = 0; i < n; i++) {
            char c = word.charAt(i);
            if(!Character.isLetterOrDigit(c)) {
                return false;
            }
            if(isVowel(c)) {
                in++;
            }
            if(!isVowel(c) && Character.isLetter(c)) {
                nv++;
            }
        }
        if(in >= 1 && nv >= 1) return true;
        return false;
    }
    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}