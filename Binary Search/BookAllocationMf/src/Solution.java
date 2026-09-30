class Solution {
    public int findPages(int[] nums, int m) {
        if (nums.length < m) {
            return -1;
        }

        int low = Integer.MIN_VALUE;
        int high = 0;
        
        for (int num : nums) {
            low = Math.max(low, num);
            high = high + num;
        }

        while (low <= high) { // low starts from not possible value

            int mid = low + ((high - low) / 2);

            if (isAllocationPossible(nums, m, mid)) {
                high = mid - 1; // if it is possible go to right side to look for minimum
            } else {
                low = mid + 1; // if it is not possible , increase the page allocation
            }
        }
        return low;
    }

    public boolean isAllocationPossible(int[] nums, int students, int currPageAllocation) {
        int allocations = 1;
        int pagesSum = 0;

        for (int pages : nums) {

            if (pagesSum + pages > currPageAllocation) {
                allocations++;
                pagesSum = pages;

                if (allocations > students) {
                    return false;
                }
            } else {
                pagesSum += pages;
            }
        }
        return true;
    }
}
