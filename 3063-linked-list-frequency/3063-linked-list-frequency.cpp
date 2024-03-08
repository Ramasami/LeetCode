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
    ListNode* frequenciesOfElements(ListNode* head) {
        unordered_map<int, ListNode*> frequencies;
        ListNode* current = head;
        ListNode* freqHead = NULL;

        while (current != NULL) {
            if (frequencies.find(current->val) != frequencies.end()) {
                ListNode* frequencyNode = frequencies[current->val];
                frequencyNode->val += 1;
                frequencies[current->val] = frequencyNode;
            } else {
                ListNode* newFrequencyNode = new ListNode(1, freqHead);
                frequencies[current->val] = newFrequencyNode;
                freqHead = newFrequencyNode;
            }
            current = current->next;
        }
        return freqHead;
    }
};