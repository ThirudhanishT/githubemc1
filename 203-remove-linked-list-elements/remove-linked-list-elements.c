/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeElements(struct ListNode* head, int val) {
    struct ListNode* dummy=malloc(sizeof(struct ListNode));
    dummy->next=head;
    struct ListNode* prev=dummy;
    struct ListNode* temp=head;
    while(temp!=NULL)
    {
        if(temp->val==val)
        {
            prev->next=temp->next;
        }
        else
        {
            prev=temp;
        }
        temp=temp->next;
    }
    struct ListNode*result= dummy->next;
    free(dummy);
    return result;
}