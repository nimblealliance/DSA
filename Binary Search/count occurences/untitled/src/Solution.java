class Solution {

    public static void main(String[] args) {

        int[] nums = {0, 0, 1, 1, 1, 2, 3};
        int target=1;
        System.out.println(countOccurrences(nums,target));

    }


    public static int countOccurrences(int[] nums, int target) {


        int first = firstOccurrence(nums,target);
        int last = lastOccurrence(nums,target);

        if (first == -1 || last ==-1){
            return 0;
        }
        return last - first +1;

    }

    public static int firstOccurrence(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while (low <= high) {

            int mid = low + ((high - low) / 2);

            if (nums[mid] == target) {
                ans = mid;
                high = mid - 1;

            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static int lastOccurrence(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while (low <= high) {

            int mid = low + ((high - low) / 2);

            if (nums[mid] == target) {
                ans = mid;
                low=mid+1;

            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
