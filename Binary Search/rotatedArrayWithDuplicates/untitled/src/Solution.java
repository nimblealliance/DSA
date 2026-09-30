class Solution {
    public boolean search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = low + ((high - low) / 2);

            if (nums[mid] == target) {
                return true;
            }

            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                //duplicate case where we do not know where to go , because low==mid==high , we do not know which side is sorted!!
                // so we decrement each side and reduce the search space! because that's what we need to do in binary search , 
                //reduc the search space

                low++;
                high--;
                continue; // do not go ahead just continue with the loop 

            }

            if (nums[low] <= nums[mid]) {

                if (nums[low] <= target && target <= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }

            } else {
                if (target >= nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }

}