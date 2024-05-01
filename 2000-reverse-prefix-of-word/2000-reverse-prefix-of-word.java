class Solution {
    public String reversePrefix(String word, char ch) {
        // TC : O(N) // SC : O(N)
        int n = word.length();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            if(word.charAt(i) == ch) {
                sb.append(word.charAt(i));
                sb.reverse();
                sb.append(word.substring(i+1));
                return sb.toString();
            }
            else {
                sb.append(word.charAt(i));
            }
        }
        return word;
    }
}