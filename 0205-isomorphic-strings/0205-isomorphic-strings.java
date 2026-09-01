class Solution {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length())
            return false;

        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            char value = t.charAt(i);

            if (map1.containsKey(key) && map1.get(key) != value) {
                return false;
            }

            if (map2.containsKey(value) && map2.get(value) != key) {
                return false;
            }

            map1.put(key, value);
            map2.put(value, key);

        }

        return true;
    }
}