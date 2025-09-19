bool searchMatrix(int** matrix, int matrixSize, int* matrixColSize, int target) {
     int row=matrixSize;
     int col=*matrixColSize;
     int left=0;
     int right=(row*col)-1;
     while(left<=right)
     {
        int mid=left+((right-left)/2);
        int val=matrix[mid/col][mid%col];
        if(val==target)
        {
            return true;
        }
        else if(val<target)
        {
            left=mid+1;
        }
        else 
        {
            right=mid-1;
        }
    }
    return false;
}