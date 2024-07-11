class Solution {
    public String reverseParentheses(String s) {
        // TC : O(N*N) // SC : O(N)
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == '(') {
                st.push(sb.length());
            }
            else if(s.charAt(i) == ')') {
                int j = st.pop();
                rev(sb, j, sb.length()-1);
            }
            else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public void rev(StringBuilder sb, int i, int j) {
        while(i <= j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
    }
}