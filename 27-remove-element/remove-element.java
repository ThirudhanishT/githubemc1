class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> narray=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                narray.add(nums[i]);
            }

        }
        for(int i=0;i<narray.size();i++)
        {
           nums[i]=narray.get(i);
        }
        return narray.size();
    }
}