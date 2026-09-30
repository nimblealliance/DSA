public class LongestSubarrayPositives {

    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 7, 1, 9};
        int k=15;

        System.out.println(longestSubarray(nums,k));
    }

    public static int longestSubarray(int[] nums , int k){

        int left=0;
        int maxLen=0;
        int sum=0;

        for (int right = 0; right < nums.length; right++) {

            sum+=nums[right];
            while (sum > k && left <=right){
                sum-=nums[left];
                left++;
            }

            if (sum ==k){
                int len=(right-left)+1;
                maxLen = Math.max(len, maxLen);
            }
        }
        return maxLen;
    }
}
