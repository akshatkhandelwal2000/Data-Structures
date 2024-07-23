class Solution {
    public boolean doesAliceWin(String s) {
        // TC : O(N) // SC : O(1)
        int n = s.length();
        int cnt = 0;
        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            if(isVowel(c)) cnt++;
        }
        if(cnt > 0) return true;
        return false;
    }
    public boolean isVowel(char c ){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}