/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
bool check(struct TreeNode*t1,struct TreeNode*t2)
{
    if(t1==NULL && t2==NULL )
    {
        return true;
    }
    if(t1==NULL || t2==NULL)
    {
        return false;
    }
    return ((t1->val==t2->val) && check(t1->left,t2->right) && check(t1->right,t2->left));
} 
bool isSymmetric(struct TreeNode* root) {
    if(root==NULL)
    {
        return false;
    }
    return check(root->left,root->right);
}