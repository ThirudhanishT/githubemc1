class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int num:nums)
        {
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        Map<Integer, Integer> sortedMap = hm.entrySet()
                .stream()
                .sorted((a, b) -> {
    if(a.getValue() != b.getValue())
        return a.getValue() - b.getValue();

    return b.getKey() - a.getKey();
})
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        List<Integer> l1=new ArrayList<>();
        for(int key : sortedMap.keySet())
        {
        int freq = sortedMap.get(key);
        for(int i = 0; i < freq; i++)
        {
        l1.add(key);
        }
}
        int arr[]=new int[l1.size()];
        for(int i=0;i<l1.size();i++)
        {
            arr[i]=l1.get(i);
        }
        return arr;
    }
}