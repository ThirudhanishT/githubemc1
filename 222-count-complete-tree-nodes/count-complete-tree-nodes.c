/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
int countNodes(struct TreeNode* root) {
    int l,r;
    if(root==NULL)
    {
        return 0;
    }
    l=countNodes(root->left);
    r=countNodes(root->right);
    int result;
    result=l+r+1;
    return result;
}