/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
int maxDepth(struct TreeNode* root) {
    if(root==NULL)
    {
        return 0;
    }
    int l=maxDepth(root->left);
    int r=maxDepth(root->right);
    if(r>l)
    {
        return r+1;
    }
    return l+1;
}