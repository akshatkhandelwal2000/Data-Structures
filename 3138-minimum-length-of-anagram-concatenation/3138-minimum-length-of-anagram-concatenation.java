class Solution {
    public int minAnagramLength(String s) {
        // TC : O(N + N) // SC : O(26) 
        int n = s.length();
        for(int i = 1; i <= n; i++) {
            if(n % i == 0 && check(s, i)) {
                return i;
            }
        }
        return -1;
    }
    public boolean check(String s, int len) {
        int[] first = new int[26];
        for(int i = 0; i < len; i++) {
            first[s.charAt(i)-'a']++;
        }
        for(int i = len; i < s.length(); i += len) {
            int[] second = new int[26];
            for(int j = i; j < i+len; j++) {
                second[s.charAt(j)-'a']++;
            }
            for(int k = 0; k < 26; k++) {
                if(second[k] != first[k]) {
                    return false;
                }
            }
        }
        return true;
    }
}