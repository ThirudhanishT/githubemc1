class Solution {
    public int findShortestSubArray(int[] nums) {

        HashMap<Integer,Integer> freq=new HashMap<>();
        HashMap<Integer, Integer> first = new HashMap<>();
        HashMap<Integer, Integer> last = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int n = nums[i];

            freq.put(n, freq.getOrDefault(n, 0) + 1);

            if (!first.containsKey(n)) {
                first.put(n, i);
            }

            last.put(n, i);
        }

        int degree = 0;

        for (int n : freq.keySet()) {
            degree = Math.max(degree, freq.get(n));
        }

        int answer = nums.length;

        for (int n : freq.keySet()) {

            if (freq.get(n) == degree) {

                int length = last.get(n) - first.get(n) + 1;

                answer = Math.min(answer, length);
            }
        }

        return answer;
    }
}