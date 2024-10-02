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
        ListNode less = null;
        ListNode more = null;
        
        ListNode l = less;
        ListNode m = more;
        
        while(head!=null) {
            if(head.val < x) {
                if(l == null)
                    l = less = head;
                else {
                    l.next = head;
                    l = head;
                }
            } else {
                if(m == null)
                    m = more = head;
                else {
                    m.next = head;
                    m = head;
                }
            }
            head = head.next;
        }
        if (m!=null)
            m.next = null;
        if(l == null)
            return more;
        l.next = more;
        return less;
    }
}