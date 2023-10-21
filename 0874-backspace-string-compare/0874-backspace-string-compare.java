class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(char ch : s.toCharArray()) {
            if(ch == '#') {
                if(!sb.isEmpty()) {
                    sb.deleteCharAt(sb.length()-1);    
                }
            }
            else {
                sb.append(ch);
                }
        }
        for(char ch : t.toCharArray()) {
            if(ch == '#') {
                if(!sb2.isEmpty()) {
                    sb2.deleteCharAt(sb2.length()-1);    
                }
            }
            else {
                sb2.append(ch);
                }
        }
        return sb.toString().equals(sb2.toString());
    }
}