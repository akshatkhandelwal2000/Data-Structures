class Solution {
    public String reverseWords(String s) {
        // TC : O(N) // SC : O(N)
        StringBuilder sb = new StringBuilder();
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            while(i < s.length() && s.charAt(i) != ' ') {
                sb.append(s.charAt(i));
                i++;
            }
            if(sb.length() != 0) {
                if(res.length() != 0) {
                    res.insert(0, ' ');
                    res.insert(0, sb);
                }
                else {
                    res.append(sb);
                }
                sb.setLength(0);
            }
        }
        return res.toString();
    }
}