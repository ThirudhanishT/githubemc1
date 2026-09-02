class Solution {
    public boolean uniformArray(int[] nums1) {

        int []nums2=new int[nums1.length];

        int count=0;
        int count1=0;

        for(int i=0;i<nums1.length;i++)
        {
            int n=nums1[i];

            if(n%2 != 0)
            {
                nums2[i]=n;
            }
            else
            {
                for(int j=0;j<nums1.length;j++)
                {
                    if(i!=j && nums1[j]%2 != 0)
                    {
                        nums2[i]=n-nums1[j];
                        break;
                    }
                }
            }
        }

        for(int i=0;i<nums2.length;i++)
        {
            int num=nums2[i];

            if(num%2==0)
            {
                count++;
            }
            else
            {
                count1++;
            }
        }

        if(count==nums2.length || count1==nums2.length)
        {
            return true;
        }

        return false;
    }
}