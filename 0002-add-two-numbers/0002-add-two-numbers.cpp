/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        int carry = 0;
        int sum = 0;
        ListNode* head = l1;
        while(l1!=NULL && l2!= NULL) {
            sum = l1->val + l2->val + carry;
            carry=sum/10;
            sum%=10;
            l1->val=sum;
            if (l1->next == NULL && l2 -> next != NULL) {
                l1 -> next = l2 -> next; 
                l1=l1->next;
                break;
            } else if (l1->next == NULL && carry == 1) {
                l1 -> next = l1->next=new ListNode(1);
                l1=l1->next;
                carry = 0;
                break;
            }
            l1=l1->next;
            l2=l2->next;
        }
        while(l1 != NULL) {
            sum = l1->val + carry;
            carry=sum/10;
            sum%=10;
            l1->val=sum;
            if (l1->next == NULL && carry==1) {
                l1 -> next = l1->next=new ListNode(1);
                carry = 0;
            }
            l1=l1->next;
        }
        return head;
    }
};