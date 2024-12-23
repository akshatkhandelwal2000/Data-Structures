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
    public int minimumOperations(TreeNode root) {
        // TC : O(NlogN) // SC : O(N)
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int ans = 0;
        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                list.add(curr.val);
                if(curr.left != null) {
                    q.offer(curr.left);
                }
                if(curr.right != null) {
                    q.offer(curr.right);
                }
            }
            ans += getCount(list);
        } 
        return ans;
    }
    public int getCount(List<Integer> list) {
        int b = 0;
        List<Integer> a = new ArrayList<>(list);
        Collections.sort(a);
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < list.size(); i++) {
            map.put(list.get(i), i);
        }
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) != a.get(i)) {
                b++;
                int k = map.get(a.get(i));
                map.put(list.get(i), k);
                list.set(k, list.get(i));
            }
        }
        return b;
    }
}