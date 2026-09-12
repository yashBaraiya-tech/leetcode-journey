class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        solve(ans, output, nums, used);

        return ans;

    }

    static void solve(List<List<Integer>> ans, List<Integer> output, int[] nums, boolean[] used) {
        if (output.size() == nums.length) {
            ans.add(new ArrayList<>(output));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i])
                continue;

            used[i] = true;

            output.add(nums[i]);
            solve(ans, output, nums, used);

            // backtrack
            output.remove(output.size() - 1);
            used[i] = false;

        }
    }
}