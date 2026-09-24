class Solution {
    public int smallestIndex(int[] nums) {
        int res=-1;
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
                int temp=n;
                int rem=0;
                int sum=0;
                while(temp!=0)
                {
                   rem=temp%10;
                   sum=sum+rem;
                   temp=temp/10;
                }
                if(sum==i)
                {
                    return i;
                }
        }
        return res;
    }
}