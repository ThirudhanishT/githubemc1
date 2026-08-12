class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        int count1=0;
        int count2=0;
        for(int num:nums1)
        {
            map1.put(num,map1.getOrDefault(num,0)+1);
        }
        for(int num:nums2)
        {
            map2.put(num,map2.getOrDefault(num,0)+1);
        }
        List<Integer> l=new ArrayList<>();
        for(int key:map1.keySet())
        {
            if(map1.containsKey(key) && map2.containsKey(key))
            {
               count1+=map1.get(key);
            }
        }
        for(int key:map2.keySet())
        {
            if(map2.containsKey(key) && map1.containsKey(key))
            {
                count2+=map2.get(key);
            }
        }
        l.add(count1);
        l.add(count2);
        int arr[]=new int[l.size()];
        for(int i=0;i<l.size();i++)
        {
            arr[i]=l.get(i);
        }
        return arr;
    }
}