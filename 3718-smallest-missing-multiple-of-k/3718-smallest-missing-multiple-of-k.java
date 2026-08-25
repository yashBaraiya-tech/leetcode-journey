class Solution {
    public int missingMultiple(int[] nums, int k) {

        // my approch
        // boolean flag = true;
        // int i = 0;
        // int j = 1;
        // int target = k * j;
        // while (flag && i < nums.length) {
        //     if (nums[i] == target) {
        //         j++;
        //         i = 0;
        //         target = k * j;
        //     } else {
        //         i++;
        //     }
        // }
        // return target;

        // optimal approch
        Set<Integer> set = new HashSet<>();

        for (int e : nums) {
            set.add(e);
        }

        int target = k;

        while (set.contains(target)) {
            target += k;
        }

        return target;

    }
}