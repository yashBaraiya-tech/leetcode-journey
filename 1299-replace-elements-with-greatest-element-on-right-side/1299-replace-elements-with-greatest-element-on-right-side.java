class Solution {
    public int[] replaceElements(int[] arr) {

        int n = arr.length;
        int max = arr[n - 1];
        int last = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            last = max;
            max = Math.max(max, arr[i]);
            arr[i] = last;
        }
        arr[n - 1] = -1;
        return arr;
    }
}