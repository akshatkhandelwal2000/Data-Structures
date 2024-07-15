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
    public TreeNode createBinaryTree(int[][] descriptions) {
        // TC : O(N) // SC : O(N)
        int n = descriptions.length;
        Map<Integer, Integer> lmap = new HashMap<>();
        Map<Integer, Integer> rmap = new HashMap<>();
        for(int i = 0; i < n; i++) {
            if(descriptions[i][2] == 1) {
                lmap.put(descriptions[i][0], descriptions[i][1]);
            }
            else {
                rmap.put(descriptions[i][0], descriptions[i][1]);
            }
        }
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            set.add(descriptions[i][1]);
        }
        TreeNode root = new TreeNode();
        for(int i = 0; i < n; i++) {
            if(!set.contains(descriptions[i][0])) {
                root.val = descriptions[i][0];
                break;
            }
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            if(lmap.containsKey(curr.val)) {
                curr.left = new TreeNode(lmap.get(curr.val));
                stack.push(curr.left);
                lmap.remove(curr.val);
            }
            if(rmap.containsKey(curr.val)) {
                curr.right = new TreeNode(rmap.get(curr.val));
                stack.push(curr.right);
                rmap.remove(curr.val);
            }
        }
        return root;
    }
}