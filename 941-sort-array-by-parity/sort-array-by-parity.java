class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
           int n=nums[i]%2;
           if(n==0)
           {
              l1.add(nums[i]);
           }
           else
           {
             l2.add(nums[i]);
           }
        }
           List<Integer> fl=new ArrayList<>();
           for(int n:l1)
           {
            fl.add(n);
           }
           for(int n:l2)
           {
            fl.add(n);
           }
           int[] res=new int[fl.size()];
           for(int i=0;i<fl.size();i++)
           { 
             res[i]=fl.get(i);
           }
        return res;
    }
}