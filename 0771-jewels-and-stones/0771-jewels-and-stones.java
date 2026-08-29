class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        int ans = 0;

        for (char ch : jewels.toCharArray()) {
            set.add(ch);
        }

        for (char c : stones.toCharArray()) {
            if (set.contains(c))
                ans++;
        }

        return ans;
    }
}