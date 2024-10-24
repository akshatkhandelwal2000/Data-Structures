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
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        // TC : O(N) // SC : O(N)
        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;
        boolean flip = root1.val == root2.val && flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left);
        boolean noflip = root1.val == root2.val && flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right);
        return flip || noflip;
    }
}