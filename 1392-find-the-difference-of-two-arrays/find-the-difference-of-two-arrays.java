class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        for(int num:nums1)
        {
            map1.put(num,map1.getOrDefault(num,0)+1);
        }
        for(int num:nums2)
        {
            map2.put(num,map2.getOrDefault(num,0)+1);
        }
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        for(int key:map1.keySet())
        {
            if(map1.get(key)!=map2.get(key) && map1.containsKey(key)!=map2.containsKey(key))
            {
                l1.add(key);
            }
        }
        for(int key:map2.keySet())
        {
            if(map2.get(key)!=map1.get(key) && map2.containsKey(key)!=map1.containsKey(key))
            {
                l2.add(key);
            }
        }
        List<List<Integer>> l=new ArrayList<>();
        l.add(l1);
        l.add(l2);
        return l;
    }
}