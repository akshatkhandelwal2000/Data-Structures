class Solution {
    public int numberOfSpecialChars(String word) {
        // TC : O(1) // SC : O(1)
        int[] freq = new int[128];
        for(int i = 0; i < word.length(); i++) {
            freq[word.charAt(i)]++;
        }
        int ans = 0;
        for(int i = 0; i < word.length(); i++) {
            int asci = word.charAt(i);
            if(freq[asci] >= 1 && freq[asci-32] >= 1) {
                ans++;
                freq[asci] = 0;
                freq[asci-32] = 0;
            }
        }
        return ans;
    }
}