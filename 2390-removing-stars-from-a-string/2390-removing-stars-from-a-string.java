class Solution {
    public String removeStars(String s) {
        // TC : O(N) // SC : O(N)
        int n = s.length();
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(ch == '*' && !st.isEmpty()) {
                st.pop();
            }
            else {
                st.push(ch);
            }
        }
        while(!st.isEmpty()) {
            ans.insert(0, st.pop());
        }
        return ans.toString();
    }
}