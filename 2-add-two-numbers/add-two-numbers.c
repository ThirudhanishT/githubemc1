/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    int carry = 0;
    struct ListNode* dummyHead = malloc(sizeof(struct ListNode));
    dummyHead->val = 0;  // dummy value
    dummyHead->next = NULL;

    struct ListNode* current = dummyHead;

    while (l1 != NULL || l2 != NULL || carry > 0) {
        int val1 = (l1 != NULL) ? l1->val : 0;
        int val2 = (l2 != NULL) ? l2->val : 0;
        int sum = val1 + val2 + carry;

        carry = sum / 10;
        int digit = sum % 10;

        struct ListNode* newNode = malloc(sizeof(struct ListNode));
        newNode->val = digit;
        newNode->next = NULL;

        current->next = newNode;
        current = current->next;

        if (l1 != NULL) l1 = l1->next;
        if (l2 != NULL) l2 = l2->next;
    }

    struct ListNode* result = dummyHead->next;
    free(dummyHead); // free the dummy node
    return result;
}
