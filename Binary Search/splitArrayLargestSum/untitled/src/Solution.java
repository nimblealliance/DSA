class Solution {
    public int splitArray(int[] nums, int k) {

        int low = Integer.MIN_VALUE;
        int high = 0;

        for (Integer x : nums) {
            if (x > low){
                low=x;
            }
            high += x;
        }

        while (low <= high) {

            int mid = low + ((high - low) / 2);

            if (canSplit(nums, k, mid)) {  // if splits is possible we move to left to get minimum
                high = mid - 1;
            } else { // if split is not possible we move to right
                low = mid + 1;
            }
        }
        return low;

    }

    public boolean canSplit(int[] nums, int splitsRequired, int maxSplitSum) {

        int splits = 1;
        int splitSum = 0;

        for (int i = 0; i < nums.length; i++) {

            if (splitSum + nums[i] > maxSplitSum) {
                splits++;
                splitSum = nums[i];

                if (splits > splitsRequired) { // if the number of splits we did is greater than the required splits return false.
                    return false;
                }

            } else {
                splitSum += nums[i];
            }
        }
        return true;
    }

}