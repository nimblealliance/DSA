public class Solution {

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {

        int max= Integer.MIN_VALUE;
        int sum=0;
        int subArrayStart=0;
        int subArrayEnd=0;
        int start=0;

        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            if(sum>max){
                max=sum;
                subArrayStart=start;
                subArrayEnd=i;
            }
            if(sum<0){
                sum=0;
                start=i+1;
            }
        }
        System.out.println(subArrayStart+","+subArrayEnd);
        return max;
    }

//    public static int maxSubArray(int[] nums) {
//
//        int max = Integer.MIN_VALUE;
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i; j < nums.length; j++) {
//                int sum=0;
//                for (int k = i; k <= j; k++) {
//                  sum+=nums[k];
//                }
//                max=Math.max(max,sum);
//            }
//        }
//        return max;
//    }
//


}
