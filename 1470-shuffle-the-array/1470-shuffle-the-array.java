class Solution {
    public int[] shuffle(int[] nums, int n) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i < n) {
                l1.add(nums[i]);
            } else {
                l2.add(nums[i]);
            }
        }

        int k = 0;
        for (int i = 0; i < l1.size(); i++) {
            nums[k++] = l1.get(i);
            nums[k++] = l2.get(i);
        }

        return nums;

    }
}