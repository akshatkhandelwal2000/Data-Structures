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
    public ListNode mergeNodes(ListNode head) {
        // TC : O(N) // SC : O(1)
       ListNode dummy = new ListNode();
       ListNode temp = dummy;
       ListNode curr = head;
       while(curr != null) {
        int sum = 0;
        while(curr != null && curr.val != 0) {
            sum += curr.val;
            curr = curr.next;
        }
        if(sum != 0) {
            temp.next = new ListNode(sum);
            temp = temp.next;
        }
        curr = curr.next;
       }
       return dummy.next;
    }
}