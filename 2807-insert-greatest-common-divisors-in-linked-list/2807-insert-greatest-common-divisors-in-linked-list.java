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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next == null) return head;
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        ListNode dummyHead = head;
        while(dummyHead.next != null) {
            int val1 = dummyHead.val;
            int val2 = dummyHead.next.val;
            int gc = gcd(val1, val2);
            temp.next = new ListNode(val1);
            temp.next.next = new ListNode(gc);
            temp = temp.next.next;
            dummyHead = dummyHead.next;
        }
        temp.next = new ListNode(dummyHead.val);
        return dummy.next;
    }
    public int gcd(int a, int b) {
        while(a > 0 && b > 0) {
            if(a > b) {
                a = a % b;
            }
            else {
                b = b % a;
            }
        }
        if(a == 0) {
            return b;
        }
        return a;
    }
}