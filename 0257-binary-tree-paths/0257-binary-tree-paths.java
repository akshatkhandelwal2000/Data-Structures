/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        // TC : O(N) // SC : O(N)
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        rec(root, ans, sb);
        return ans;
    }
    public void rec(TreeNode root, List<String> ans, StringBuilder sb) {
        if(root == null) return;
        int len = sb.length();
        if(len > 0) sb.append("->");
        sb.append(root.val);
        if(root.left == null && root.right == null) {
            ans.add(sb.toString());
        }
        rec(root.left, ans, sb);
        rec(root.right, ans, sb);
        sb.setLength(len);
    }
}