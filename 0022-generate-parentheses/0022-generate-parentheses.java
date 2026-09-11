class Solution {
    public List<String> generateParenthesis(int n) {
        int left = n;
        int right = n;

        List<String> ans = new ArrayList<>();
        String output = "";
        solve(ans, output, left, right);
        return ans;
    }

    static void solve(List<String> ans, String output, int left, int right) {
        if (left == 0 && right == 0) {
            ans.add(output);
            return;
        }

        if (left > 0) {
            solve(ans, output + "(", left - 1, right);
        }

        if (right > left) {
            solve(ans, output + ")", left, right - 1);
        }

    }
}