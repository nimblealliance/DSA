public class LongestSubarrayOnlyPositives {


    public static void main(String[] args) {
        System.out.println(longestSubarray(new int[]{10, 5, 2, 7, 1, 9} , 15));
    }


    public static int longestSubarray(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int sum = 0;
        int length = 0;
        int maxLength = 0;

        while(r < nums.length){
            while(sum > k && l < nums.length ){
                sum-=nums[l];
                l++;
            }

            while(sum < k){
                sum+=nums[r];
                r++;
            }

            if (sum == k){
                length = r - l + 1;
                r++;
            }

            maxLength = Math.max(maxLength , length);
        }
        return maxLength;
    }
}
