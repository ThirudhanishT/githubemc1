class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        for(int i=0;i<arr2.length;i++)
        {
            int count=0;
            int n=arr2[i];
            for(int j=0;j<arr1.length;j++)
            {
                if(n==arr1[j])
                {
                    count++;
                }
            }
            for(int k=0;k<count;k++)
            {
                l1.add(n);
            }
        }
        for(int i=0;i<arr1.length;i++)
        {
            int flag=0;
            int n=arr1[i];
            for(int j=0;j<arr2.length;j++)
            {
                if(n==arr2[j])
                {
                   flag=1;
                   break;
                }
            }
            if(flag==0)
            {
                l2.add(n);
            }
        }
        int a2[]=new int[l2.size()];
        for(int i=0;i<l2.size();i++)
        {
            a2[i]=l2.get(i);
        }
        Arrays.sort(a2);
        int res[]=new int [l1.size()];
        for(int i=0;i<l1.size();i++)
        {
            res[i]=l1.get(i);
        }
        int res1[]=new int[res.length+a2.length];
        System.arraycopy(res, 0, res1, 0, res.length);
        System.arraycopy(a2,0,res1,res.length,a2.length);
        return res1;
    }
}