public class Solution2 {


    public static void main(String[] args) {
        int [] nums = {1,2,3,1,1,1,1,3,3};
        int k =6;
        System.out.println(longestSubarray(nums, k));
    }

    //o(n) TC and SC is o(1)
    public static int longestSubarray(int [] nums , int k){
        int sum=0;
        int maxLen=0;
        int left =0, right=0;

        for (right = 0; right < nums.length; right++) {
            sum+=nums[right];

            while(sum>k && left <=right){
                sum-=nums[left];
                left++;
            }

            if (sum==k){
                int len = (right - left)+1;
                maxLen = Math.max(maxLen,len);
            }

        }
        return maxLen;
    }
}
