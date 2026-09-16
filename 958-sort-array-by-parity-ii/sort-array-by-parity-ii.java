class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int res[]=new int[nums.length];
        int j=0;
        int k=1;
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            if(n%2==0)
            {
               res[j]=n;
               j=j+2;
            }
            else
            {
               res[k]=n;
               k=k+2;
            }

        }
        return res;
    }
}