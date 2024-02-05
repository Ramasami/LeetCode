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
    bool isPalindrome(ListNode* head) {
        if (head -> next == NULL)
            return true;
        ListNode* slow = head;
        ListNode* fast = head;
        while (fast->next !=NULL && fast->next->next!=NULL){
            slow=slow->next;
            fast=fast->next->next;
        }
        ListNode* rev = reverse(slow->next);
        while(rev!=NULL) {
            if(rev->val!=head->val)
                return false;
            rev = rev -> next;
            head = head -> next;
        }
        return true;
    }
    ListNode* reverse(ListNode* head) {
        ListNode* prev = head;
        head = head->next;
        prev -> next = NULL;
        while(head!=NULL) {
            ListNode* temp = head->next;
            head->next=prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
};