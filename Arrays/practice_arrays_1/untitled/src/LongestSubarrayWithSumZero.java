import java.util.HashMap;

public class LongestSubarrayWithSumZero {
    public static void main(String[] args) {

        int[] nums = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(subarray(nums));
    }


    public static int subarray(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();

        int sum=0;
        int length=0;
        int maxLength=0;

        for (int i = 0; i < nums.length; i++) {

            sum+=nums[i];
            System.out.println(sum);
            System.out.println(map);

            if (sum==0){
                maxLength=i+1;
                System.out.println(maxLength);
            }


            if(map.containsKey(sum)){
                length=i-map.get(sum);
                maxLength=Math.max(length,maxLength);
                System.out.println(maxLength);
            }

            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
            System.out.println();


        }
        return maxLength;
    }





}
