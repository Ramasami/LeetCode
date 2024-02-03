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
    public ListNode removeElements(ListNode head, int val) {
        ListNode newHead = new ListNode(0, head);
        head = newHead;
        while(true) {
            if (head.next == null)
                break;
            else if (head.next.val == val)
                head.next = head.next.next;
            else
                head = head.next;
        }
        return newHead.next;
    }
}