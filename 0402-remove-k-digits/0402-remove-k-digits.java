class Solution {
    public String removeKdigits(String num, int k) {
        // TC : O(N+K) // SC : O(N)
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack<>();
        int rem = k;
        for(int i = 0; i < num.length(); i++) {
            int val = num.charAt(i)-48;
            while(!st.isEmpty() && rem > 0 && st.peek() > val) {
                rem--;
                st.pop();
            }
            st.push(val);
        }
        while(!st.isEmpty()) {
            sb.append(st.pop());
        }
        while(sb.length() > 0 && rem--> 0) {
            sb.deleteCharAt(0);
        }
        for(int i = sb.length()-1; i >= 0; i--) {
            if(sb.charAt(i) == '0') {
                sb.deleteCharAt(i);
            }
            else {
                break;
            } 
        }
        return sb.length() == 0 ? "0" : sb.reverse().toString();
    }
}