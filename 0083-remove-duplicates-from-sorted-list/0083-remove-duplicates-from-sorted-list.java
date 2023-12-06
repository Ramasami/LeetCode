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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return head;
        ListNode topNode = head;
        ListNode prevNode = head;
        ListNode currNode = topNode.next;
        while(currNode != null) {
            if (currNode.val != prevNode.val) {
                prevNode.next = currNode;
                prevNode = currNode;
            }
            currNode = currNode.next;
        }
        prevNode.next = null;
        return topNode;
    }
}