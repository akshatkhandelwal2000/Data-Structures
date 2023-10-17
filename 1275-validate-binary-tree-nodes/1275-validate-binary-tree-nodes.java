class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        // TC : O(N) // SC : O(N)
        int root = findRoot(n, leftChild, rightChild);
        if(root == -1) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        Stack<Integer> st = new Stack<>();
        set.add(root);
        st.push(root);
        while(!st.isEmpty()) {
            int node = st.pop();
            int[] children = {leftChild[node], rightChild[node]};
            for(int child : children) {
                if(child != -1) {
                    if(set.contains(child)) { 
                        return false;
                    }
                st.push(child);
                set.add(child);
                }
            }
         }
         return set.size() == n;
    }
    private int findRoot(int n, int[] leftChild, int[] rightChild) {
        Set<Integer> set = new HashSet<>();
        for(int node : leftChild) {
            set.add(node);
        }
        for(int node : rightChild) {
            set.add(node);
        }
        for(int i = 0; i < n; i++) {
            if(!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }
}