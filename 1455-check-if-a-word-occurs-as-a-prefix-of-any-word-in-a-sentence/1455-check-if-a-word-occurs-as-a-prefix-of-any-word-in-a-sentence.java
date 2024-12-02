class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        // TC : O(N) // SC : O(N)
        String[] word = sentence.split(" ");
        int n = word.length;
        for(int i = 0; i < n; i++) {
            if(word[i].indexOf(searchWord) == 0) {
                return i+1;
            }
        }
        return -1;
    }
}