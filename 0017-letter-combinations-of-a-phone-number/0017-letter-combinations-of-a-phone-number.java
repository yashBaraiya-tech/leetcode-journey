class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        StringBuilder output = new StringBuilder();

        int i = 0;
        String[] map = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

        solve(ans, output, i, map, digits);
        return ans;
    }

    static void solve(List<String> ans, StringBuilder output, int i, String[] map, String digits) {

        if (i >= digits.length()) {
            ans.add(output.toString());
            return;
        }

        int value = digits.charAt(i) - '0';
        String mapped = map[value];

        for (int j = 0; j < mapped.length(); j++) {
            output.append(mapped.charAt(j));
            solve(ans, output, i + 1, map, digits);
            output.deleteCharAt(output.length() - 1);
        }
    }
}