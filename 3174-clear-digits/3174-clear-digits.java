class Solution {
    public String clearDigits(String s) {
        // TC : O(N) // SC : O(N)
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(!st.isEmpty() && ch >= '0' && ch <= '9') {
                st.pop();
            }
            else {
                st.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}