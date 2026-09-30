public class KadaneAlgo {

    public static void main(String[] args) {
        int[] nums ={-2, 1, 2};
        System.out.println(maxSubarraySum(nums));


    }

    public static int maxSubarraySum(int[] nums){

        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        int startIndex=0;
        int endIndex=0;
        int tempStart=0;
        for (int i = 0; i < nums.length; i++) {

            sum+=nums[i];

            if(sum > maxSum){
                maxSum=sum;
                startIndex=tempStart;
                endIndex=i;
            }

            if (sum<0){
                sum=0;
                tempStart=i;
            }

        }
        return maxSum;
    }

}
