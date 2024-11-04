class Solution {
    public String compressedString(String word) {
        int n = word.length();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i < n) {
            int count = 1;
            char c = word.charAt(i);
            i++;
            while(i < n && word.charAt(i) == c && count < 9) {
                count++;
                i++;
            }
            sb.append(count);
            sb.append(c);
        }
        return sb.toString();
    }
}