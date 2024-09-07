class Solution {
    public int maxRepeating(String sequence, String word) {
        // TC : O(N) // SC : O(1)
        int n = sequence.length();
        String s = word;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            if(sequence.contains(word)) {
                ans++;
                word += s;
            }
        }
        return ans;
    }
}