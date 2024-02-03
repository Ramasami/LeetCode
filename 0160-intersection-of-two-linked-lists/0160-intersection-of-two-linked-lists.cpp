/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        int alen = getLength(headA);
        int blen = getLength(headB);
        if(alen > blen) {
            headA = traverse(headA, alen-blen);
        } else {
            headB = traverse(headB, blen-alen);
        }
        while(headA!=NULL) {
            if(headA == headB)
                return headA;
            headA = headA->next;
            headB = headB->next;
        }
        return headA;
        
    }
    
    int getLength(ListNode *head) {
        int len = 0;
        while(head!=NULL) {
            head=head->next;
            len++;
        }
        return len;
    }
    
    ListNode* traverse(ListNode* head, int len) {
        while(len>0) {
            head=head->next;
            len--;
        }
        return head;
    }
};