class Solution {
    public int[] resultArray(int[] nums) {
        List <Integer> l1=new ArrayList<>();
        List <Integer> l2=new ArrayList<>();
        l1.add(nums[0]);
        l2.add(nums[1]);
        for(int i=2;i<nums.length;i++)
        {
            if(l1.getLast() > l2.getLast())
            {
                l1.add(nums[i]);
            }
            else
            {
                l2.add(nums[i]);
            }
        }
        List<Integer> fl=new ArrayList<>();
        for(int i:l1)
        {
            fl.add(i);
        }
        for(int i:l2)
        {
            fl.add(i);
        }
        int res[]=new int[fl.size()];
        for(int i=0;i<fl.size();i++)
        {
             res[i]=fl.get(i);
        }
        return res;
    }
}