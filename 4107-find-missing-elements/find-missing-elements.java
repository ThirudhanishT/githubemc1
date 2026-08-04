class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> l=new ArrayList<>(); 
        int min=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<min)
            {
                min=nums[i];
            }
        }
        int max=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }
        }
        for(int j=min;j<=max;j++)
        {
            boolean flag=false;
            for(int k=0;k<nums.length;k++)
            {
               if(nums[k]==j)
               {
                flag=true;
                break;
               }
            }
            if(!flag)
            {
                l.add(j);
            }
        }
        return l;
    }
}