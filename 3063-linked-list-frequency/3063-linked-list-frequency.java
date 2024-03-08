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
    public ListNode frequenciesOfElements(ListNode head) {
        Map<Integer, ListNode> frequencies = new HashMap<>();
        ListNode current = head;
        ListNode freqHead = null;

        while (current != null) {
            if (frequencies.containsKey(current.val)) {
                ListNode frequencyNode = frequencies.get(current.val);
                frequencyNode.val += 1;
                frequencies.put(current.val,frequencyNode);
            } else {
                ListNode newFrequencyNode = new ListNode(1, freqHead);
                frequencies.put(current.val,newFrequencyNode);
                freqHead = newFrequencyNode;
            }
            current = current.next;
        }
        return freqHead;
    }
}