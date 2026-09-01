class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char ca[] = str.toCharArray();
            Arrays.sort(ca);
            String key = new String(ca);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(str);
        }

        for (List<String> list : map.values()) {
            ans.add(new ArrayList<>(list));
        }

        return ans;

    }
}