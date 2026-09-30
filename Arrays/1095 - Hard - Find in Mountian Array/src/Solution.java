class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peakIndex = findPeak(mountainArr);

        int ans = binarySearch(mountainArr, target, 0, peakIndex, true);
        if (ans != -1) return ans;

        return binarySearch(mountainArr, target, peakIndex + 1, mountainArr.length() - 1, false);
    }

    private int findPeak(MountainArray mountainArr) {
        int left = 0;
        int right = mountainArr.length() - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            int midVal = mountainArr.get(mid);
            int nextVal = mountainArr.get(mid + 1);

            if (midVal > nextVal) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private int binarySearch(MountainArray mountainArr, int target, int left, int right, boolean ascending) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midVal = mountainArr.get(mid);

            if (midVal == target) return mid;

            if (ascending) {
                if (midVal < target) left = mid + 1;
                else right = mid - 1;
            } else {
                if (midVal < target) right = mid - 1;
                else left = mid + 1;
            }
        }
        return -1;
    }
}
