class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        
        int h=0;
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            int n=nums[i];
            for(int j=0;j<nums.length;j++)
            {
                if(n==nums[j])
                {
                    count++;
                }
            }
            if(count>k)
            {
                for(int y=0;y<k;y++)
                {
                   l.add(n);
                }
                i=i+count-1;
            }
            else
            {
                l.add(n);
            }
        }
        int res[]=new int[l.size()];
        for(int i=0;i<l.size();i++)
        {
            res[i]=l.get(i);
        }
        Arrays.sort(res);
        return res;
    }
}