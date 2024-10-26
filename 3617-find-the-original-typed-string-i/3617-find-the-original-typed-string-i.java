class Solution {
    public int possibleStringCount(String word) {
        // TC : O(N) // SC : O(1)
        int n = word.length();
        int ans = 1;
        for(int i = 0; i < n-1; i++) {
            if(word.charAt(i) == word.charAt(i+1)) {
                ans++;
            }
        }
        return ans;
    }
}