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
    public TreeNode reverseOddLevels(TreeNode root) {
        // TC : O(N) // SC : O(N)
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int in = 0;
        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            if(in%2 == 0) {
                for(int i = 0; i < size; i++) {
                    TreeNode curr = q.poll();
                    if(curr.left != null) {
                        list.add(curr.left.val);
                        q.offer(curr.left);
                    }
                    if(curr.right != null) {
                        list.add(curr.right.val);
                        q.offer(curr.right);
                    }
                }
            }
            in++;
            if(in%2 != 0) {
                size = q.size();
                Collections.reverse(list);
                for(int i = 0; i < size; i++) {
                    TreeNode curr = q.poll();
                    curr.val = list.get(i);
                    if(curr.left != null) {
                        q.offer(curr.left);
                    }
                    if(curr.right != null) {
                        q.offer(curr.right);
                    }
                }
            }
        }
        return root;
    }
}