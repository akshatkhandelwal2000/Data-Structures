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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // TC : O(N) // SC : O(1)
         return dfs(root, 0, targetSum);
    }
    private boolean dfs(TreeNode root, int curSum, int targetSum) {
        if(root == null) return false;
        if(root.left == null && root.right == null) {
            return targetSum == curSum + root.val;
        }
        boolean left = dfs(root.left, curSum + root.val, targetSum);
        boolean right = dfs(root.right, curSum + root.val, targetSum);
        return left || right;
    }
}