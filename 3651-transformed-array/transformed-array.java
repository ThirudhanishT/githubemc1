class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            if(n>0)
            {
               res[i]=nums[(i+nums[i])%nums.length];
            }
              else if (n < 0) {
                int index = (i + nums[i]) % nums.length;

                if (index < 0) {
                    index += nums.length;
                }

                res[i] = nums[index];
            }
        }
        return res;
    }
}