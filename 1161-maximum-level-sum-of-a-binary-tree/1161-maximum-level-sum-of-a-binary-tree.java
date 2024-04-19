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
    public int maxLevelSum(TreeNode root) {
        // TC : O(N) // SC : O(N)
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int level = 1;
        int prevsum = Integer.MIN_VALUE;
        int lev = 1;
        while(!q.isEmpty()) {
            int size = q.size();
            int cursum = 0;
            for(int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                cursum += curr.val;
                if(curr.left != null) {
                    q.add(curr.left);
                }
                if(curr.right != null) {
                    q.add(curr.right);
                }
            }
            if(cursum > prevsum) {
                prevsum = cursum;
                level = lev;
            }
            lev++;
        }
        return level;
    }
}