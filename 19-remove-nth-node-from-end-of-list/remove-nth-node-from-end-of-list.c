/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n)  {
    struct ListNode* temp = head;
    int l = 0;

    // Count the length of the list
    while (temp != NULL) {
        l = l + 1;
        temp = temp->next;
    }

    // If we need to delete the head
    if (n == l) {
        struct ListNode* newnode = head;
        head = head->next;
        free(newnode);
        return head;
    }

    // Find the node before the one we want to delete
    temp = head;
    struct ListNode* prev = NULL;
    int i = 1;

    while (i < l - n + 1) {
        prev = temp;
        temp = temp->next;
        i++;
    }

    // Delete the node
    prev->next = temp->next;
    free(temp);

    return head;
}
