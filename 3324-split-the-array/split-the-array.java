class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        if(nums.length %2 !=0 )
        {
            return false;
        }
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            hm.put(n,hm.getOrDefault(n,0)+1);
            if(hm.get(n)>2)
            {
                return false;
            }
        }
        return true;
    }
}