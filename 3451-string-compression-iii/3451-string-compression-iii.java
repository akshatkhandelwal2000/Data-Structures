class Solution {
    public String compressedString(String word) {
        // TC : O(N) // SC : O(2N)
        int n = word.length();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i < n) {
            char ch = word.charAt(i);
            int count = 0;
            while(i < n && ch == word.charAt(i) && count < 9) {
                count++;
                i++;
            }
            sb.append(count);
            sb.append(ch);
        }
        return sb.toString();
    }
}