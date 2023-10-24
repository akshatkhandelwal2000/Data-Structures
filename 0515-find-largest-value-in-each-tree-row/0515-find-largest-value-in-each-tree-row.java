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
    public List<Integer> largestValues(TreeNode root) {
        // TC -> O(N)
        // SC -> O(N)
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return ans;
        q.add(root);
        while(!q.isEmpty()) {
            int len = q.size();
            int cMax = Integer.MIN_VALUE;
            for(int i = 0; i < len; i++) {
                TreeNode node = q.poll();
                cMax = Math.max(cMax, node.val);
                if(node.left != null) {
                    q.add(node.left);
                }
                if(node.right != null) {
                    q.add(node.right);
                }
            }
            ans.add(cMax);
        }
        return ans;
    }
}