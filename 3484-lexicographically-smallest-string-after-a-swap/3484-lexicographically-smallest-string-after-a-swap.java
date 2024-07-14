class Solution {
    public String getSmallestString(String s) {
        // TC : O(N) // SC : O(N)
        int n = s.length();
        char[] ch = s.toCharArray();
        for(int i = 0; i < n-1; i++) {
            if(ch[i]%2 == ch[i+1]%2) {
                if(ch[i+1] < ch[i]) {
                    char temp = ch[i];
                    ch[i] = ch[i+1];
                    ch[i+1] = temp;
                    break;
                }
            }
        }
        return new String(ch);
    }
}