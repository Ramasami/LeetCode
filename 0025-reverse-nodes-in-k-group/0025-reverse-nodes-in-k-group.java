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
        ListNode temp = head;
        int x = 0;
        while(x<k&&temp!=null) {
            temp = temp.next;
            x++;
        }
        if(x<k)
            return head;
        
        if (head == null)
            return null;
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = head.next;
        for(int i=0;i<k;i++) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if (curr == null)
                return prev;
            next = curr.next;
        }
        head.next = reverseKGroup(curr, k);
        return prev;
    }
}