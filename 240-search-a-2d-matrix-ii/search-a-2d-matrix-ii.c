bool searchMatrix(int** matrix, int matrixSize, int* matrixColSize, int target){
    int row=matrixSize;
    int col=matrixColSize[0];
    int left=0;
    int right=col-1;
    while(left<row && right>=0)
    {
        int val=matrix[left][right];
        if(val==target)
        {
            return true;
        }
        else if(val>target)
        {
            right--;
        }
        else
        {
            left++;
        }
    }
    return false;
}