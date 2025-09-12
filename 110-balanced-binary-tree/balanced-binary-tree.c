/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
int traverse(struct TreeNode* node)
{
    if(node==NULL)
    {
        return 0;
    }
    int ln=traverse(node->left);
    if(ln==-1)
    {
        return -1;
    }
    int rn=traverse(node->right);
    if(rn==-1)
    {
        return -1;
    }
    if(abs(ln-rn)>1) return -1;
    return ((ln>rn?ln:rn)+1);
}
bool isBalanced(struct TreeNode* root) {
    return traverse(root)!=-1;
}