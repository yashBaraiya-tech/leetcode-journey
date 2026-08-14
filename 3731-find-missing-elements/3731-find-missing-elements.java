class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0, j = 0;

        while (j < n) {
            if (nums[j] == nums[0] + i) {
                i++;
                j++;
            } else {
                ans.add(nums[0] + i);
                i++;
            }
        }

        return ans;
    }
}