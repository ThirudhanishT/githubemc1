int maxFrequencyElements(int* nums, int numsSize) {
    int count[numsSize];
    int result=0;
    int max=0;
    int acount;
    for(int i=0;i<numsSize;i++)
    {
        count[i]=1;
        for(int j=i+1;j<numsSize;j++)
        {
            if(nums[i]==nums[j])
            {
                count[i]++;
            }
        }
        if(count[i]>max)
        {
            max=count[i];
        }
    }
    for(int i=0;i<numsSize;i++)
    {
        if(count[i]==max)
        {
            acount=0;
            for(int j=0;j<i;j++)
            {
                if(nums[i]==nums[j] && count[j]==max)
                {
                    acount=1;
                    break;
                }
            }
            if(!acount)
            {
                result=result+count[i];
            }
        }
    }
    return result;
}