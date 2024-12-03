class Solution {
    public String addSpaces(String s, int[] spaces) {
        // TC : O(N) // SC : O(N)
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        int j = 0;
        for(int i = 0; i < n; i++) {
            if(j < spaces.length && i == spaces[j]) {
                j++;
                ans.append(' ');
                ans.append(s.charAt(i));
            }
            else {
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}