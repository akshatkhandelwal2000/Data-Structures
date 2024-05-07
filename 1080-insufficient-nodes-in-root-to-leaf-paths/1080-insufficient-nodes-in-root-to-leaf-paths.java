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
    public TreeNode sufficientSubset(TreeNode root, int limit) {
        // TC : O(N) // SC : O(H)
        return dfs(root, limit, 0);   
    }
    public TreeNode dfs(TreeNode root, int limit, int pathsum) {
        if(root == null) return null;
        if(root.left == null && root.right == null) {
            pathsum += root.val;
            if(pathsum < limit) return null;
            else return root; 
        }
        root.left = dfs(root.left, limit, pathsum + root.val);
        root.right = dfs(root.right, limit, pathsum + root.val);
        if(root.left == null && root.right == null) return null;
        else return root;
    }
}