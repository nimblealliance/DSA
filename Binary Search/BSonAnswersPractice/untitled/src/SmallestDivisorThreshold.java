public class SmallestDivisorThreshold {


    public static void main(String[] args) {

        int[] nums = {44,22,33,11,1};
        int threshold = 5;
        System.out.println(smallestDivisor(nums,threshold));
    }

    public static int smallestDivisor(int [] nums , int threshold){

        int max_val=Integer.MIN_VALUE;

        for (Integer i : nums){
            max_val=Math.max(max_val, i);
        }

        int low = 1;
        int high = max_val;

        while(low<=high){

            int mid = low + ((high-low)/2);

            int totalSum = divisorSum(nums , mid);

            if (totalSum<=threshold){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return low;

    }

    public static int divisorSum(int [] nums , int divisor){

        int totalSumOfDivison=0;

        for (int i = 0; i < nums.length; i++) {
            totalSumOfDivison+= (nums[i] + divisor - 1)/divisor;
        }

        return totalSumOfDivison;
    }
}
