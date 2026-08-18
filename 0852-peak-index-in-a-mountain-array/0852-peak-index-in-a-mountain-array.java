class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int s = 0;
    int e = n - 1;

    while (s < e) {
        int mid = s + (e - s) / 2;

        if (arr[mid] < arr[mid + 1]) {
            // We are going uphill, so peak is on the right
            s = mid + 1;
        } else {
            // We are going downhill, so peak is at mid or left
            e = mid;
        }
    }

    return s;
    }
}