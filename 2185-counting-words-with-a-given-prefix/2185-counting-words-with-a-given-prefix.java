class Solution {
    public int prefixCount(String[] words, String pref) {
        // TC : O(N) // SC : O(1)
        int ans = 0;
        for(String word : words) {
            if(word.indexOf(pref) == 0) {
                ans++;
            }
        }
        return ans;
    }
}