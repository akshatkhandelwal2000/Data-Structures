class Solution {
    public String makeFancyString(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(sb.length() > 0 && sb.charAt(sb.length()-1) == s.charAt(i)) {
                count++;
                if(count >= 2) {
                    count--;
                    continue;
                }
            }
            else if(sb.length() > 0 && sb.charAt(sb.length()-1) != s.charAt(i)) {
                count = 0;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}