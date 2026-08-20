class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int max1=nums1[0];
        int max2=nums2[0];
        int d=1000000;
        int flag=0;
        for(int i=0;i<nums1.length;i++)
        {
            int n=nums1[i];
            for(int j=0;j<nums2.length;j++)
            {
                if(nums2[j]==n)
                {
                 d=Math.min(d,n);
                 flag=1;  
                }
            }
        }
        for(int i=1;i<nums1.length;i++)
        {
            if(nums1[i]<max1)
            {
                max1=nums1[i];
            }
        }
        for(int i=1;i<nums2.length;i++)
        {
            if(nums2[i]<max2)
            {
                max2=nums2[i];
            }
        }
        String m1=String.valueOf(max1);
        String m2=String.valueOf(max2);
        String r=null;
        if(max2>max1)
        {
            r=m1+m2;
        }
        else
        {
            r=m2+m1;
        }
        int res=Integer.parseInt(r);
        if(flag==1)
        {
            return d;
        }
        return res;
    }
}