class Solution {
    public int findMin(int[] nums) {
        int s = 0;
        int e = nums.length - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] > nums[e]) {
                // Minimum must be on the right
                s = mid + 1;
            } 
            else if (nums[mid] < nums[e]) {
                // Minimum is at mid or on the left
                e = mid;
            } 
            else {
                // nums[mid] == nums[e]
                // Cannot determine the side, safely discard e
                e--;
            }
        }

        return nums[s];
    }
}

