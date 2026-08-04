class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List <Integer> l=new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            int flag=0;
            int target=nums1[i];
            for(int j=0;j<nums2.length;j++)
            {
               if(target==nums2[j])
               {
               for(int k=0;k<l.size();k++)
               {
                if(target==l.get(k))
                {
                    flag=1;
                    break;
                }
               }
               if(flag==0)
                l.add(nums1[i]);
               }  
            }
        }
        int s=l.size();
        int inter[]=new int[s];
        for(int i=0;i<s;i++)
        {
            inter[i]=l.get(i);
        }
        return inter;
    }
}