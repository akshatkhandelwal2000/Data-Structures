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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        // TC : O(N^2) // SC : O(N)
        return rec(nums, 0, nums.length);
    }
    public TreeNode rec(int[] nums, int l, int r) {
        if(l == r) return null;
        int max = findMax(nums, l, r);
        TreeNode root = new TreeNode(nums[max]);
        root.left = rec(nums, l, max);
        root.right = rec(nums, max+1, r);
        return root;
    }
    public int findMax(int[] nums, int l, int r) {
        int max = -1;
        int maxi = 0;
        for(int i = l; i < r; i++) {
            if(nums[i] > max) {
                max = nums[i];
                maxi = i;
            }
        }
        return maxi;
    }
}