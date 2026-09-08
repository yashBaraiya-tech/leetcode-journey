class Solution {
    public int findMin(int[] nums) {
        int pivot = -1;

        int n = nums.length;

        int s = 0;
        int e = n - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] <= nums[n - 1]) {
                e = mid - 1;
            } else {
                pivot = mid;
                s = mid + 1;
            }
        }

        if (pivot == n - 1)
            return nums[0];
        else
            return nums[pivot + 1];
    }
}