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
    int sum = 0;
    public TreeNode bstToGst(TreeNode root) {
        // TC : O(N) // SC : O(H)
        rec(root);
        return root;
    }
    public void rec(TreeNode root) {
        if(root == null) return;
        rec(root.right);
        sum += root.val;
        root.val = sum;
        rec(root.left);
    }
}