class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (char c1 : s.toCharArray()) {
            map.put(c1, map.getOrDefault(c1, 0) + 1);
        }

        for (char c2 : t.toCharArray()) {
            map.put(c2, map.getOrDefault(c2, 0) - 1);
        }

        for (Character key : map.keySet()) {
            if (map.get(key) != 0)
                return false;

        }

        return true;

    }
}