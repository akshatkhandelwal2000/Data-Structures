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
    public TreeNode sortedArrayToBST(int[] nums) {
        // TC : O(N) as we are visiting each node exactly once // SC : O(logN) // logN space for recursion stack space for height balanced tree
        if(nums.length == 0) {
            return null;
        }
        return constructBST(nums, 0, nums.length - 1);
    }
    public TreeNode constructBST(int[] nums, int left, int right) {
        if(left > right) {
            return null;
        }
        int midpoint = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[midpoint]);
        node.left = constructBST(nums, left, midpoint - 1);
        node.right = constructBST(nums, midpoint + 1, right);
        return node;
    }
}

// Dry Run - for example : nums = [0, 1, 2, 3, 4, 5, 6, 7]

//      [0, 1, 2, 3, 4, 5, 6, 7] // 4 is the middle element root
//      [0, 1, 2, 3]    [5, 6, 7]     
//      2 is the root   6 is the root
//      [0, 1]    [3]   [5]    [7]
//      1 and   3 are the root // 5 and 7 both are root as they are single elements left
//      [0]
//      0 is the root