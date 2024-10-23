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
    public TreeNode replaceValueInTree(TreeNode root) {
        // TC : O(N) // SC : O(N)
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int pre = root.val;
        while(!q.isEmpty()) {
            int size = q.size();
            int sum = 0;
            for(int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                curr.val = pre-curr.val;
                int sibsum = 0;
                if(curr.left != null) {
                    sibsum += curr.left.val;
                }
                if(curr.right != null) {
                    sibsum += curr.right.val;
                }
                if(curr.left != null) {
                    sum += curr.left.val;
                    curr.left.val = sibsum;
                    q.offer(curr.left);
                }
                if(curr.right != null) {
                    sum += curr.right.val;
                    curr.right.val = sibsum;
                    q.offer(curr.right);
                }
            }
            pre = sum;
        }
        return root;
    }
}