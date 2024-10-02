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
    public ListNode partition(ListNode head, int x) {
        ListNode less = new ListNode();
        ListNode more = new ListNode();
        
        ListNode l = less;
        ListNode m = more;
        
        while(head!=null) {
            if(head.val < x) {
                l.next = head;
                l = head;
            } else {
                m.next = head;
                m = head;
            }
            head = head.next;
        }
        m.next = null;
        l.next = more.next;
        return less.next;
    }
}