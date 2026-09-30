class Solution {
    public static void nextPermutation(int[] nums) {


        //https://www.youtube.com/watch?v=JDOXKqF60RQ&ab_channel=takeUforward


        // from the back we find the index where peak occurs , i.e. nums[i] < nums[i+1] and then try to find the element which is greater than the index element but not too large , then
        //swap it and reverse the array from the index+1 till the end.
        int index = -1;
        int n = nums.length;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }

        }

        if (index == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }

        for (int i = n - 1; i > index; i--) {
            if (nums[i] > nums[index]) {
                swap(nums, i, index);
                break;
            }
        }

        reverse(nums, index + 1, n - 1);
        System.gc();

    }

    public static void reverse(int[] nums, int start, int end) {

        while (start <= end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void swap(int[] nums, int i, int j) {

        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;

    }

}