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
    public boolean isCompleteTree(TreeNode root) {
        // TC : O(N) // SC : O(N)
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean flag = false;
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                if(curr.left == null && curr.right != null) return false;
                if(curr.left != null) {
                    if(flag) return false;
                    else q.offer(curr.left);
                }
                if(curr.right != null) {
                    if(flag) return false;
                    else q.offer(curr.right);
                }
                if(curr.left == null || curr.right == null) {
                    flag = true;
                }
            }
        }
        return true;
    }
}