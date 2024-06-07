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
    public boolean isCousins(TreeNode root, int x, int y) {
        // TC : O(N) // SC : O(N)
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()) {
            int size = q.size();
            Map<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                if(curr.left != null) {
                    q.offer(curr.left);
                    map.put(curr.left.val, curr.val);
                }
                if(curr.right != null) {
                    q.offer(curr.right);
                    map.put(curr.right.val, curr.val);
                }
            }
            if(map.containsKey(x) && map.containsKey(y) && 
            map.get(x) != map.get(y)) return true;
        }
        return false;
    }
}