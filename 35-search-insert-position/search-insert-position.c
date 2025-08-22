int searchInsert(int* nums, int numsSize, int target) {
    int y=numsSize;
    for(int i=0;i<numsSize;i++)
    {
        if(nums[i]>=target)
        {
            y=i;
            break;
        }
    }
    return y;
}