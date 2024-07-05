/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        // TC : O(N) + O(N/2) // SC : O(N/2)
        ListNode temp = head;
        int val = temp.val;
        temp = temp.next;
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        List<Integer> list = new ArrayList<>();
        int n = 1;
        while(temp != null && temp.next != null) {
            n++;
            if(temp.val > temp.next.val && temp.val > val) {
                list.add(n);
            }
            if(temp.val < temp.next.val && temp.val < val) {
                list.add(n);
            }
            val = temp.val;
            temp = temp.next;
        }
        if(list.size() <= 1) return ans;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int min2 = Integer.MAX_VALUE;
        int pre = -1;
        for(int i : list) {
            if(pre != -1) {
                min2 = Math.min(min2, Math.abs(pre-i));
            }
            min = Math.min(min, i);
            max = Math.max(max, i);
            pre = i;
        }
        if(min != Integer.MAX_VALUE &&  max != Integer.MIN_VALUE) {
            ans[0] = min2;
            ans[1] = max-min;
        }
        return ans;
    }
}