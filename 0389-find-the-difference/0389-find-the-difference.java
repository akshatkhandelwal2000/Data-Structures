class Solution {
    public char findTheDifference(String s, String t) {
        int n = t.length();
        for(int i = 0; i < n; i++) {
            if(s.indexOf(t.charAt(i)) == -1) {
                return t.charAt(i);
            }
        }
        return t.charAt(0); 
    }
}