class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        // TC : O(N) // SC : O(N)
        int n = pushed.length;
        int m = popped.length;
        Stack<Integer> st = new Stack<>();
        int in = 0;
        for(int i = 0; i < n; i++) {
            if(!st.isEmpty() && st.peek() == popped[in]){
                while(!st.isEmpty() && st.peek() == popped[in]) {
                    st.pop();
                    in++;
                }
            }
            st.push(pushed[i]);
        }
        if(in == m) return true;
        while(!st.isEmpty()) {
            if(st.peek() == popped[in]) {
                st.pop();
                in++;
            }
            else return false;
        }
        return in == m;
    }
}