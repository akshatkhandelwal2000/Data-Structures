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
        // TC : O(N) // SC : O(1)
        ListNode temp = head;
        int val = temp.val;
        temp = temp.next;
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        int n = 1;
        int cnt = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int min2 = Integer.MAX_VALUE;
        while(temp != null && temp.next != null) {
            n++;
            if(temp.val > temp.next.val && temp.val > val) {
                cnt++;
                if(min != Integer.MAX_VALUE) {
                    min2 = Math.min(min2, Math.abs(min-n));
                }
                if(max != Integer.MIN_VALUE) {
                    min2 = Math.min(min2, Math.abs(max-n));
                }
                min = Math.min(min, n);
                max = Math.max(max, n);
            }
            if(temp.val < temp.next.val && temp.val < val) {
                cnt++;
                if(min != Integer.MAX_VALUE) {
                    min2 = Math.min(min2, Math.abs(min-n));
                }
                if(max != Integer.MIN_VALUE) {
                    min2 = Math.min(min2, Math.abs(max-n));
                }
                min = Math.min(min, n);
                max = Math.max(max, n);
            }
            val = temp.val;
            temp = temp.next;
        }
        if(cnt <= 1) return ans;
        ans[0] = min2;
        ans[1] = max-min;
        return ans;
    }
}