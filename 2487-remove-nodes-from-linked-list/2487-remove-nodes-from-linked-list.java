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
    public ListNode removeNodes(ListNode head) {
        // TC : O(N) // SC : O(1)
        ListNode temp = rev(head);
        ListNode tmp1 = temp;
        int max = tmp1.val;
        while(tmp1.next != null) {
            if(tmp1.next.val < max) {
                tmp1.next = tmp1.next.next;
            }
            else {
                tmp1 = tmp1.next;
                max = tmp1.val;
            }
        }
        return rev(temp);
    }
    public ListNode rev(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        while(cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre; 
    }
}