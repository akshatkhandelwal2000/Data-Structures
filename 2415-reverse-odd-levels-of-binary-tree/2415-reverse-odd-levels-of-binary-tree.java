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
        // TC : O(N) // SC : O(H)
        dfs(root.left, root.right, 1);
        return root;
    }
    public void dfs(TreeNode root1, TreeNode root2, int level) {
        if(root1 == null || root2 == null) return;
        if(level % 2 != 0) {
            int temp = root1.val;
            root1.val = root2.val;
            root2.val = temp;
        }
        dfs(root1.left, root2.right, level + 1);
        dfs(root1.right, root2.left, level + 1);
        // TC : O(N) // SC : O(N)
        // Queue<TreeNode> q = new LinkedList<>();
        // q.offer(root);
        // int level = 0;
        // while(!q.isEmpty()) {
        //     int size = q.size();
        //     int in = 0;
        //     for(int i = 0; i < size; i++) {
        //         TreeNode curr = q.poll();
        //         if(curr.left != null) q.offer(curr.left);
        //         if(curr.right != null) q.offer(curr.right);
        //     }
        //     level++;
        //     if(level % 2 != 0) {
        //         int[] nums = new int[q.size()];
        //         for(TreeNode p : q) {
        //             nums[in++] = p.val;
        //         }
        //         int sz = q.size()-1;
        //         for(TreeNode p : q) {
        //             p.val = nums[sz--];
        //         }
        //     }
        // }
        // return root;
    }
}