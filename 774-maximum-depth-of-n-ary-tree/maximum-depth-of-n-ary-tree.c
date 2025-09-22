/**
 * Definition for a Node.
 * struct Node {
 *     int val;
 *     int numChildren;
 *     struct Node** children;
 * };
 */

int maxDepth(struct Node* root) {
    if(root==NULL)
    {
        return 0;
    }
    int depth=0;
    for(int i=0;i<root->numChildren;i++)
    {
       int cdepth=maxDepth(root->children[i]);
        if(cdepth>depth)
        {
            depth=cdepth;
        }
    }
    return depth+1;
}