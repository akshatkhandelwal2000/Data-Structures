class Solution {
    public int maximumGain(String s, int x, int y) {
        // TC : O(N) + O(N) // SC : O(N)
        int n = s.length();
        String str = "";
        String ss = "";
        int max = 0;
        int min = 0;
        if(x <= y) {
            ss = "ab";
            min = x;
        }
        else if(y < x) {
            ss = "ba";
            min = y;
        }
        if(x >= y) {
            str = "ab"; 
            max = x;
        }
        else {
            str = "ba";
            max = y;
        }
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
        st.clear();
        st = new Stack<>();
        while(i < sbs.length()) {
            if(!st.isEmpty() && sbs.charAt(i) == ss.charAt(1) && st.peek() == ss.charAt(0)) {
                ans += min;
                st.pop();
            }
            else st.push(sbs.charAt(i));
            i++;
        }
        return ans;
    }
}