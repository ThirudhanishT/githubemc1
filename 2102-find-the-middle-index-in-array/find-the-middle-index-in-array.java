class Solution {
    public int findMiddleIndex(int[] nums) {
        int m=0;
        for(m=0;m<nums.length;m++)
        {
             int sum=0;
            int sum1=0;
        for(int i=0;i<m;i++)
        {
            sum=sum+nums[i];
        }
        for(int i=m+1;i<nums.length;i++)
        {
            sum1=sum1+nums[i];
        }
        if(sum==sum1)
        {
            return m;
        }
        }
        return -1;   
    }
}