class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int n = s.length();

        int count = 0;

        ArrayList<Character> chars = new ArrayList<>();

         while (j < n) {
            char ch = s.charAt(j);

            if (!chars.contains(ch)) {
                chars.add(ch);
                j++;
                count = Math.max(count, j - i);
            } else {
                chars.remove(Character.valueOf(s.charAt(i)));
                i++;
            }
        }

        return count;

        
    }
}