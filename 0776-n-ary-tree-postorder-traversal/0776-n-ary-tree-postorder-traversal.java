/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        // TC : O(N) // SC : O(N)
        List<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        rec(root, ans);
        return ans;
    }
    public void rec(Node root, List<Integer> ans) {
        if(root == null) return;
        for(int i = 0; i < root.children.size(); i++) {
            rec(root.children.get(i), ans);
        }
        ans.add(root.val);
    }
}