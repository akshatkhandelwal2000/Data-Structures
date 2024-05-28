class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        // TC : O(N) // SC : O(1)
        int n = s.length();
        int i = 0;
        int j = 0;
        int ans = 0;
        int abs = 0;
        while(j < n) {
            abs += Math.abs(s.charAt(j)-t.charAt(j));
            if(abs > maxCost) {
                while(i <= j && abs > maxCost) {
                    abs -= Math.abs(s.charAt(i)-t.charAt(i));
                    i++;
                }
            }
            ans = Math.max(ans, j-i+1);
            j++; 
        }
        return ans;
    }
}