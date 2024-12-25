class Solution {
    public int countPrefixes(String[] words, String s) {
        // TC : O(N) // SC : O(1)
        int ans = 0;
        for(String word : words) {
            if(s.indexOf(word) == 0) {
                ans++;
            }
        }
        return ans;
    }
}