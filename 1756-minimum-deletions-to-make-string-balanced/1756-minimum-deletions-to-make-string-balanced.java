class Solution {
    public int minimumDeletions(String s) {
        // TC : O(N) // SC : O(N)
        int n = s.length();
        int ans = 0;
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(!st.isEmpty() && st.peek() == 'b' && ch == 'a') {
                st.pop();
                ans++;
            }
            else st.push(ch);
        }
        return ans;
    }
}