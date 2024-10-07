class Solution {
    public int minLength(String s) {
        // TC : O(N) // SC : O(N)
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(!st.isEmpty() && ch == 'B' && st.peek() == 'A') {
                st.pop();
            }
            else if(!st.isEmpty() && ch == 'D' && st.peek() == 'C') {
                st.pop();
            }
            else {
                st.push(ch);
            }
        }
        return st.size();
    }
}