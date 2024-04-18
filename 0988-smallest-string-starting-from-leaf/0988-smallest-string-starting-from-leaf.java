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
    public String smallestFromLeaf(TreeNode root) {
        // TC : O(N) // SC : O(H)
        StringBuilder sb = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        dfs(root, sb, ans);
        return ans.toString();
    }
    public void dfs(TreeNode root, StringBuilder sb, StringBuilder ans) {
        if(root == null) return;
        sb.insert(0, (char)(root.val+97));
        if(root.left == null && root.right == null) {
            if(ans.length() == 0) {
                ans.append(sb);
            }
            else {
                if(sb.toString().compareTo(ans.toString()) < 0) {
                    ans.delete(0, ans.length());
                    ans.append(sb);
                }  
            }
        }
        dfs(root.left, sb, ans);
        dfs(root.right, sb, ans);
        sb.deleteCharAt(0);
    } 
}