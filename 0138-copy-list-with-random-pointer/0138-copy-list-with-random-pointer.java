/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null)
            return head;
        Node temp = head;
        Node next = null;
        while(temp!=null) {
            next = temp.next;
            temp.next = new Node(temp.val);
            temp.next.next = next;
            temp = next;
        }
        temp = head;
        while(temp!=null) {
            if(temp.random != null)
                temp.next.random = temp.random.next;
            temp = temp.next.next;
        }
        
        Node ans = new Node(0);
        temp = ans;
        while(head!=null) {
            temp.next = head.next;
            head.next = head.next.next;
            head = head.next;
            temp = temp.next;
        }
        
        return ans.next;
    }
}