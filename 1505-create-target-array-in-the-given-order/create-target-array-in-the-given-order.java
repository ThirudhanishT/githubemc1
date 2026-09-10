class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int res[]=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
        
                int n=nums[i];
                int id=index[i];
                for(int k=i;k>id;k--)
                {
                    res[k]=res[k-1];
                }
                res[id]=n;
        }
        return res;
    }
}