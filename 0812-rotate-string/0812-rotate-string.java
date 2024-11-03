class Solution {
    public boolean rotateString(String s, String goal) {
        // TC : O(N) // SC : O(N)
        if(s.length() != goal.length()) {
            return false;
        }
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < n; i++) {
            if(sb.substring(i, sb.length()).equals(goal)) {
                return true;
            }
            sb.append(sb.charAt(i));
        }
        return false;
    }
}