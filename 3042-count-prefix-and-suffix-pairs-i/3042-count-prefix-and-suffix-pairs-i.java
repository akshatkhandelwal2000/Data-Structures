class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        // TC : O(N^2) // SC : O(1)
        int n = words.length;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(isPrefixAndSuffix(words[i], words[j])) {
                    ans++;
                }
            }
        }
        return ans; 
    }
    public boolean isPrefixAndSuffix(String a, String b) {
        if(!b.startsWith(a) || !b.endsWith(a)) {
            return false;
        }
        return true;
    }
}