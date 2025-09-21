int diagonalSum(int** mat, int matSize, int* matColSize) {
    int row=matSize;
    int total=0;
    int col=*matColSize;
    for(int i=0;i<row;i++)
    {
        total+=mat[i][i];
        total+=mat[i][col-i-1];
    }
    if(matSize%2==1)
    {
        total-=mat[matSize/2][matSize/2];
    }
    return total;
}