class Solution {
    public int maximumGain(String s, int x, int y) {
        // TC : O(N) + O(N) // SC : O(N)
        int n = s.length();
        int max = Math.max(x, y);
        int min = Math.min(x, y);
        String str = x >= y ? "ab" : "ba";
        Stack<Character> st = new Stack<>();
        int i = 0;
        int ans = 0;
        while(i < n) {
            if(!st.isEmpty() && s.charAt(i) == str.charAt(1) && st.peek() == str.charAt(0)) {
                ans += max;
                st.pop();
            }
            else st.push(s.charAt(i));
            i++;
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()) {
            sb.append(st.pop());
        }
        sb.reverse();
        String sbs = sb.toString();
        i = 0;
        while(i < sbs.length()) {
            if(!st.isEmpty() && sbs.charAt(i) == str.charAt(0) && st.peek() == str.charAt(1)) {
                ans += min;
                st.pop();
            }
            else st.push(sbs.charAt(i));
            i++;
        }
        return ans;
    }
}