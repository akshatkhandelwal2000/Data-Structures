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
    public boolean isBalanced(TreeNode root) {
        // TC : O(N) // SC : O(H)
        if(root == null) return true;
        return rec(root) != -1;
    }
    public int rec(TreeNode root) {
        if(root == null) return 0;
        int l = rec(root.left);
        int r = rec(root.right);
        if(l == -1 || r == -1 || Math.abs(l-r) > 1) return -1;
        return 1+Math.max(l,r);
    }
}