public class MaximumSubarray {


    public static void main(String[] args) {

        int[] nums = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(maxSubarray(nums));

    }

    public static int maxSubarray(int[] nums){
        int max= Integer.MIN_VALUE;
        int sum=0;
        int start=-1;
        int ansEnd=-1;
        int ansStart=-1;
        for (int i = 0; i < nums.length; i++) {

            if (sum ==0){
                start=i;
            }

            sum+=nums[i];

            if (sum>max){
                max=sum;
                ansStart=start;
                ansEnd=i;
            }

            if(sum<0){
                sum=0;
            }
        }
        System.out.println("Max subarray starts from "+ansStart+" to "+ansEnd);
        return max;
    }
}
