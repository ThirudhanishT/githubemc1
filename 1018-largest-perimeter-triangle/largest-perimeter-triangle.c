int cal_peri(int i,int j,int k)
{
    if(i+j>k && i+k>j && j+k>i)
    {
        return i+j+k;
    }
    else
        return 0;
}
int largestPerimeter(int* nums, int numsSize) {
    int max=0;
    int peri;
    for(int i=0;i<numsSize;i++)
    {
        for(int j=0;j<numsSize;j++)
        {
            if(nums[j]>nums[i])
            {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
    }
    for(int i=0;i<numsSize-2;i++)
    {
                peri=cal_peri(nums[i],nums[i+1],nums[i+2]);
                if(peri>max)
                {
                    max=peri;
                }
    }
    return max;
}