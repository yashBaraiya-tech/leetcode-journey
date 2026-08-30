class Solution {

    static void solve(List<List<Integer>> ans, List<Integer> output, int i, int[] candidates, int target) {

        if (target == 0) {

            ans.add(new ArrayList<>(output));
            return;
        }

        if (target < 0 || i >= candidates.length) {
            return;
        }

        // include
        output.add(candidates[i]);
        solve(ans, output, i + 1, candidates, target - candidates[i]);

        // backtrack
        output.remove(output.size() - 1);

        while (i + 1 < candidates.length && candidates[i] == candidates[i + 1]) {
            i++;
        }

        // exclude
        solve(ans, output, i + 1, candidates, target);

    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        int i = 0;
        solve(ans, output, i, candidates, target);
        return ans;
    }
}