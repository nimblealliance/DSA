import java.util.HashSet;

public class MaximumSumOfDistinctMfs {

    public static void main(String[] args) {
        System.out.println(maximumSubarraySum(new int[]{3,5,3,4},2));
    }


    public static long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int maxSum = 0;
        int sum = 0;
        int left = 0;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {
            if (!set.contains(nums[right])) {
                sum += nums[right];
                count++;
                set.add(nums[right]);

                if (count > k) {
                    sum -= nums[left];
                    set.remove(nums[left]);
                    count--;
                    left++;
                }
            }else {
                sum -= nums[left];
                set.remove(nums[left]);
                count--;
                left++;
            }

            if (count == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}
