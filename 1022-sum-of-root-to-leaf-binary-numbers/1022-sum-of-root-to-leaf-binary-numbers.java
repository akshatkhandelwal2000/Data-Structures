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
    public int sumRootToLeaf(TreeNode root) {
        // TC : O(N) // SC : O(H)
        return dfs(root, "", 0);
    }
    public int dfs(TreeNode root, String sum, int ans) {
        if(root == null) return ans;
        sum = sum  + root.val;
        if(root.left == null && root.right == null) {
            ans += Integer.valueOf(sum, 2);
            return ans;
        }
        return dfs(root.left, sum, ans) + dfs(root.right, sum, ans);
    }
}