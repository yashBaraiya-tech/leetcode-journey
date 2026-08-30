class Solution {
    public int minimumDeletions(int[] nums) {
        int minIdx = 0;
        int maxIdx = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[maxIdx])
                maxIdx = i;

            if (nums[i] < nums[minIdx])
                minIdx = i;
        }

        int left = Math.min(minIdx, maxIdx);
        int right = Math.max(minIdx, maxIdx);

        // 1. Remove both from the left 
        int removeLeft = right + 1;

        // 2. Remove both from the right 
        int removeRight = n - left;

        // 3. Remove one from left and one from right 
        int removeBoth = (left + 1) + (n - right);

        return Math.min(removeLeft, Math.min(removeRight, removeBoth));

    }
}