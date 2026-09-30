public class MinimumSubarrayLength {

    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7 , new int[] {2,3,1,2,4,3}));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int length = 0;
        int minLength = Integer.MAX_VALUE;
        int left = 0;


        for(int right = 0 ; right<nums.length ; right++){
            sum+=nums[right];

            while(sum >= target){
                sum-=nums[left];
                length = right - left + 1;
                minLength = Math.min(minLength , length);
                left++;
            }
        }
        return minLength;
    }
}
