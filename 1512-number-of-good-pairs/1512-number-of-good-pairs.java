class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int e : nums) {
            int freq = map.getOrDefault(e, 0);
            count += freq;
            map.put(e, freq + 1);
        }

        return count;
    }
}