class Solution {
    public int findPeakElement(int[] nums) {

        // int n = nums.length;

        // if (n == 1)
        //     return 0;

        // int s = 0;
        // int e = n - 1;

        // while (s <= e) {
        //     int mid = s + (e - s) / 2;

        //     int pre;
        //     if (mid - 1 >= 0)
        //         pre = nums[mid - 1];
        //     else
        //         pre = Integer.MIN_VALUE;

        //     int curr = nums[mid];

        //     int next;
        //     if (mid + 1 < n)
        //         next = nums[mid + 1];
        //     else
        //         next = Integer.MIN_VALUE;

        //     if (pre < curr && curr > next) {
        //         return mid;
        //     } else if (pre < curr && curr < next) {
        //         s = mid + 1;
        //     } else {
        //         e = mid - 1;
        //     }
        // }

        // return -1;

         int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}