public class MaximumSubarray {

    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(subArray(nums));
    }

    public static int subArray(int[] nums){

        int maxsum=Integer.MIN_VALUE;
        int sum=0;
        int ansStart=-1;
        int ansEnd=-1;
        int start=0;


        for (int i = 0; i < nums.length; i++) {

            if (sum==0){
                start =i;
            }
            sum+=nums[i];

            if (sum>maxsum){
                maxsum=sum;
                ansStart=start;
                ansEnd=i;
            }
            if (sum < 0){
                sum=0;
            }

        }

        System.out.println(ansStart + " "+ansEnd);
        return maxsum;
    }

}
