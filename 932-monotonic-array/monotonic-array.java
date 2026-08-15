class Solution {
    public boolean isMonotonic(int[] nums) {
        int increasing=0;
        int decreasing=0;
        for(int i=0;i<nums.length-1;i++)
        {
            int n=nums[i];
            if(n>nums[i+1])
            {
                increasing=1;
            }
            if(n<nums[i+1])
            {
                decreasing=1;
            }
        }
        if(increasing==1 && decreasing==1)
        {
            return false;
        }
        return true;
    }
}