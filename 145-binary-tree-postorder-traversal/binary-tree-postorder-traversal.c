/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* postorderTraversal(struct TreeNode* root, int* returnSize) {
    int* result=malloc(sizeof(int)*100);
    *returnSize=0;
    void traverse(struct TreeNode* node)
    {
        if(node==NULL)
        {
            return;
        }
        traverse(node->left);
        traverse(node->right);
        result[(*returnSize)++]=node->val;
    }
    traverse(root);
    return result;
}