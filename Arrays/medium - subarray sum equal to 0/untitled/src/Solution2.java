import java.util.HashMap;

class Solution2 {
    public static void main(String[] args) {

        int [] nums = {15, -2, 2, -8, 1, 7, 10, 23};
        int k=0;

        System.out.println(longestSubarray(nums,0));


    }




    public static int longestSubarray(int[] nums, int k) {

        int sum = 0;
        int maxLen = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (sum == k) {
                maxLen = i + 1;
            }

            // check in the prefix map if there exists any entry for a subarray which is sum-k , if it does
            //then get its value and calculate the length
            if (map.containsKey(sum - k)) {
                int length = i - map.get(sum - k);
                maxLen = Math.max(maxLen, length);
            }

            // put all the prefix sums if they do not exist in the map , if they do , do not touch it
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return maxLen;


    }

}