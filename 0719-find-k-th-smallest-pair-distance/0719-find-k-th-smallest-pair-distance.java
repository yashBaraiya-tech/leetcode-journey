class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        int n = nums.length;

        Arrays.sort(nums);

        int s = 0;
        int e = nums[n - 1] - nums[0];
        int result = 0;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            int count = findCount(nums, mid);

            if (count < k) {
                s = mid + 1;
            } else {
                result = mid;
                e = mid - 1;
            }
        }

        return result;
    }

    static int findCount(int[] nums, int mid) {
        int n = nums.length;

        int i = 0;
        int j = 1;
        int pairCount = 0;

        while (j < n) {

            while (nums[j] - nums[i] > mid) {
                i++;
            }
            pairCount += (j - i);
            j++;
        }

        return pairCount;
    }
}