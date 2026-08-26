class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        solve(nums, i, output, ans);

        return ans;
    }

    static void solve(int[] nums, int i, List<Integer> output, List<List<Integer>> ans) {

        if (i >= nums.length) {
            ans.add(new ArrayList<>(output));
            return;
        }

        int currValue = nums[i];

        // include
        output.add(currValue);
        solve(nums, i + 1, output, ans);

        // backtraack
        output.remove(output.size() - 1);

        // exclude
        while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
            i++;
        }
        solve(nums, i + 1, output, ans);

    }
}