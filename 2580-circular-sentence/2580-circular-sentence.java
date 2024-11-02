class Solution {
    public boolean isCircularSentence(String sentence) {
        // TC : O(N) // SC : O(1)
        if(sentence.charAt(0) != sentence.charAt(sentence.length()-1)) {
            return false;
        }
        int n = sentence.length();
        for(int i = 0; i < n; i++) {
            if(sentence.charAt(i) == ' ') {
                if(sentence.charAt(i-1) != sentence.charAt(i+1)) {
                    return false;
                }
            }
        }
        return true;
    }
}