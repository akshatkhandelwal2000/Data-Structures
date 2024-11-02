class Solution {
    public boolean isCircularSentence(String sentence) {
        // TC : O(N) // SC : O(N)
        if(sentence.charAt(0) != sentence.charAt(sentence.length()-1)) {
            return false;
        }
        String[] words = sentence.split(" ");
        int n = words.length;
        String s = words[0];
        for(int i = 1; i < n; i++) {
            String word = words[i];
            if(s.charAt(s.length()-1) != word.charAt(0)) {
                return false;
            }
            s = word;
        }
        return true;
    }
}