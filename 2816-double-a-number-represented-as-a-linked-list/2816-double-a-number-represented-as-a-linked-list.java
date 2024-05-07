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
    public ListNode doubleIt(ListNode head) {
        // TC : O(N) // SC : O(1)
        ListNode temp = rev(head);
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        int carry = 0;
        while(temp != null) {
            int v = temp.val;
            v = v*2;
            int rem = v%10;
            v = v/10;
            rem = rem + carry;
            carry = v;
            curr.next = new ListNode(rem);
            curr = curr.next;
            temp = temp.next;
        }
        if(carry > 0) curr.next = new ListNode(carry);
        return rev(dummy.next);
    }
    public ListNode rev(ListNode head) {
        ListNode curr = head;
        ListNode pre = null;
        while(curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }
}