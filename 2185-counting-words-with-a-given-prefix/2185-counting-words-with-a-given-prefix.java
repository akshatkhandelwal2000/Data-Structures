class Solution {
    public int prefixCount(String[] words, String pref) {
        // TC : O(N) // SC : O(1)
        int n = words.length;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            if(words[i].startsWith(pref)) {
                ans++;
            }
        }
        return ans; 
    }
}