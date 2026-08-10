class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> l1=new HashMap<>();
        HashMap<Integer,Integer> l2=new HashMap<>();
        for(int num:nums1)
        {
           l1.put(num,l1.getOrDefault(num,0)+1);
        } 
        for(int num:nums2)
        {
            l2.put(num,l2.getOrDefault(num,0)+1);
        }
        List<Integer> lt1=new ArrayList<>();
        List<Integer> lt2=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        for(int key:l1.keySet())
        {
            if(l1.containsKey(key)==l2.containsKey(key))
            {
                int y1=l1.get(key);
                int y2=l2.get(key);
                int count=Math.min(y1,y2);
                for(int i=0;i<count;i++)
                {
                    res.add(key);
                }
            }
        }
        int a=res.size();
        int[] arr=new int [a];
        for(int i=0;i<res.size();i++)
        {
            arr[i]=res.get(i);
        }
        return arr;
    }
}