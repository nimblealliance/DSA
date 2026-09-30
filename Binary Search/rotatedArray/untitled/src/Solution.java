class Solution {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 5, 1, 1, 1, 1, 1, 1};
        int k = 5;

        System.out.println(search(nums,k));

    }


    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = low + ((high - low) / 2);

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[low] <= nums[mid]) { // checking to find the sorted part of the rotated array , if low to mid is not sorted then mid to high will be sorted ,
                //that's a guarantee , so we try to find the sorted part

                if (nums[low] <= target && target <= nums[mid]) //checking if the target is in the range between low to mid
                {
                    high = mid - 1; // if the target is between low and mid range , bring high to the range
                } else {
                    low = mid + 1; // if target is not between the low and mid range , send low to mid+1
                }

            } else { // if we come here it means mid to high is the sorted part

                if (target <= nums[high] && target >= nums[mid]) //checking if the target is in the range between mid to high , opposite of above
                {
                    low = mid + 1; // if target is between mid to high , send low to that range
                } else {
                    high = mid - 1; // if target is not between mid to high , bring high to the range
                }
            }
        }
        return -1;

    }

}
