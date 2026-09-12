class Solution {
    public int[] concatWithReverse(int[] nums) {
        int res[]=new int[nums.length*2];
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            res[j++]=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            res[j++]=nums[i];
        }
        return res;
    }
}