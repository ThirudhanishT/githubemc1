/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool isPalindrome(struct ListNode* head) {
    struct ListNode* temp=head;
    int count=0;
    while(temp!=NULL)
    {
        count =count+1;
        temp=temp->next;
    }
    int top=-1;
    int stack[count];
    temp=head;
    while(temp!=NULL)
    {
        stack[++top]=temp->val;
        temp=temp->next;
    }
    temp=head;
    while(temp!=NULL && top>-1)
    {
        int num;
        num=stack[top--];
        if(temp->val!=num)
        {
            return false;
        }
        temp=temp->next;
    }
    return true;
}