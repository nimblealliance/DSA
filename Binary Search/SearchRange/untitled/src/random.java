import java.util.HashMap;

public class random {

    public static void main(String[] args) {
        int[] nums = {-1,-2,-3,-4,-5};
        int k=4;
        System.out.println(maxSubarraySum(nums,k));
    }


    public static long maxSubarraySum(int[] nums, int k) {
        long sum=0;
        long maxSum=Long.MIN_VALUE;

        HashMap<Long,Integer> map = new HashMap<>();
        map.put(0L,1);

        for (int i = 0; i < nums.length; i++) {

            sum+=nums[i];

            if(sum>maxSum && i%k==0){
                maxSum=sum;

            }

            map.put(sum,i);

        }


        return maxSum;
    }

}
