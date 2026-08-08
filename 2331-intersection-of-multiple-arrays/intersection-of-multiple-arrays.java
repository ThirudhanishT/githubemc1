class Solution {
    public List<Integer> intersection(int[][] nums) {
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int[] arr : nums) {
            for (int num : arr) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        List<Integer> result = new ArrayList<>();

        for (int num : map.keySet()) {
            if (map.get(num) == n) {
                result.add(num);
            }
        }

        Collections.sort(result);

        return result;
    }
}