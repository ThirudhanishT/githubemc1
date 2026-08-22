class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        HashMap<Integer,Integer> h2=new HashMap<>();
        for(int[] arr:nums1)
        {
            h1.put(arr[0],h1.getOrDefault(arr[0],0)+arr[1]);
        }
        for(int [] arr:nums2)
        {
            h1.put(arr[0],h1.getOrDefault(arr[0],0)+arr[1]);
        }
        int[][] ans = new int[h1.size()][2];
        int i = 0;
        for (int id : h1.keySet()) {
            ans[i][0] = id;
            ans[i][1] =h1.get(id);
            i++;
        }
        Arrays.sort(ans,(a, b) -> a[0] - b[0]);
        return ans;
    }
}