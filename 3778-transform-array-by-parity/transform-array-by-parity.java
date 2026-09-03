class Solution {
    public int[] transformArray(int[] nums) {
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            if(n%2==0)
            {
                res[i]=0;
            }
            else
            {
                res[i]=1;
            }
        }
        Arrays.sort(res);
        return res;
    }
}