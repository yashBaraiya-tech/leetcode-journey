class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        int j = 0;
        int k = 0;

        arr1[j++] = nums[0];
        arr2[k++] = nums[1];

        for (int i = 2; i < n; i++) {
            if (arr1[j - 1] > arr2[k - 1]) {
                arr1[j++] = nums[i];
            } else {
                arr2[k++] = nums[i];
            }
        }

        int a = 0;
        int i = 0;
        while (a < j) {
            nums[i] = arr1[a];
            a++;
            i++;
        }

        int b = 0;
        while (b < k) {
            nums[i] = arr2[b];
            b++;
            i++;
        }

        return nums;

    }
}