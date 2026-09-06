class Solution {
    public int majorityElement(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            int n=nums[i];
            for(int j=i;j<nums.length;j++)
            {
                if(nums[j]==n)
                {
                   count++;
                }
            }
            if(count > (nums.length/2))
            {
                return n;
            }
        }
        return 0;
    }
}