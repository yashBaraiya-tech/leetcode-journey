class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;

        int s = 0;
        int e = n - 1;

        while (s <= e) {
            int current = s + (e - s) / 2;

            int left = current - 1;
            int right = current + 1;

            if (left >= 0 && nums[current] == nums[left]) {
                if (left % 2 == 0) {
                    s = current + 1;
                } else {
                    e = current - 1;
                }
            } else if (right < n && nums[current] == nums[right]) {
                if (current % 2 == 0) {
                    s = current + 1;
                } else {
                    e = current - 1;
                }
            } else {
                return nums[current];
            }

        }
        return -1;
    }
}