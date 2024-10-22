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
    public long kthLargestLevelSum(TreeNode root, int k) {
        // TC : O(N) // SC : O(N)
        Queue<TreeNode> q = new LinkedList<>();
        List<Long> ans = new ArrayList<>();
        q.offer(root);
        while(!q.isEmpty()) {
            int size = q.size();
            long sum = 0;
            for(int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                if(curr.left != null) {
                    q.offer(curr.left);
                }
                if(curr.right != null) {
                    q.offer(curr.right);
                }
                sum += curr.val;
            }
            ans.add(sum);
        }
        Collections.sort(ans);
        return ans.size() < k ? -1 : ans.get(ans.size()-k);
    }
}