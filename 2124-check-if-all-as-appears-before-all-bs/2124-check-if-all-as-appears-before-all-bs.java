class Solution {
    public boolean checkString(String s) {
        // TC : O(N) // SC : O(1)
        int n = s.length();
        for(int i = 0; i < n-1; i++) {
            if(s.charAt(i) == 'b' && s.charAt(i+1) == 'a') return false;
        }
        return true;
    }
}