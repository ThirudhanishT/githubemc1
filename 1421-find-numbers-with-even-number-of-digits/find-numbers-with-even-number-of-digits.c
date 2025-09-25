int findNumbers(int* nums, int numsSize) {
    int count=0;
    for(int i1=0;i1<numsSize;i1++)
    {
        int i=nums[i1];
        int r=0;
        while(i!=0)
        {
            i=i/10;
            r=r+1;
        }
        if(r%2==0)
        {
            count=count+1;
        }
    }
    return count;
}