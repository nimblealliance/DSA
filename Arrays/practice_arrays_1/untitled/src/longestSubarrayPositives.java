public class longestSubarrayPositives {
    public static void main(String[] args) {

    }

    public static int longestSubarray(int[] nums , int k){

        int sum=0;
        int longest=0;
        int length=0;
        int left=0;
        for (int right = 0; right < nums.length; right++) {
            sum+=nums[right];

            while(left<=right && sum >k){
                sum-=nums[left];
                left++;
            }

            if (sum==k){
                length=right-left+1;
                longest=Math.max(length,longest);

            }
        }
        return longest;
    }

}
