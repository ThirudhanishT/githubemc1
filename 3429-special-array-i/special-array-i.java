class Solution {
    public boolean isArraySpecial(int[] nums) {
        for(int i=0;i<nums.length-1;i++)
        {
            int n=nums[i];
                if(n%2==nums[i+1]%2)
                {
                    return false;
                }
        }
        return true;
    }
}