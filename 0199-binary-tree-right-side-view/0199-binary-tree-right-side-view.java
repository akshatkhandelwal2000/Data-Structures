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
    public List<Integer> rightSideView(TreeNode root) {
        // TC : O(N) // SC : O(H)
        List<Integer> ans = new ArrayList<>();
        rv(root, 0, ans);
        return ans;
    }
    private void rv(TreeNode root, int curlevel, List<Integer> ans) {
        if(root == null) {
            return;
        }
        if(curlevel == ans.size()) {
            ans.add(root.val);
        }
        rv(root.right, curlevel+1, ans);
        rv(root.left, curlevel+1, ans);
    }
}