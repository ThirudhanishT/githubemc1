/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
int minDepth(struct TreeNode* root) {
    if(root==NULL)
    {
        return 0;
    }
    if(root->left==NULL)
    {
        return 1+minDepth(root->right);
    }
    if(root->right==NULL)
    {
        return 1+minDepth(root->left);
    }
    int l=minDepth(root->left);
    int r=minDepth(root->right);
    if(r<l)
    {
        return r+1;
    }
    return l+1;
}