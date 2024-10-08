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
    public ListNode reverseKGroup(ListNode head, int k) {
        // TC : O(N) // SC : O(1)
        if(head == null || k == 1) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy, curr = dummy, next = dummy;
        int count = 0;
        while(curr.next != null) {
            curr = curr.next;
            count++;
        }
        while(count >= k) {
            curr = pre.next;
            next = curr.next;
            for(int i = 1; i < k; i++) {
                curr.next = next.next;
                next.next = pre.next;
                pre.next = next;
                next = curr.next;
            }
            pre = curr;
            count -= k;
        }
        return dummy.next;
    }
}