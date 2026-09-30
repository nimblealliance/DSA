import java.util.HashMap;

public class longestSubarrayPositivesAndNegatives {
    public static void main(String[] args) {
        int[] nums={10, 5, 2, 7, 1, -10};
        int k=15;
        System.out.println(longestSubarray(nums,k));
    }

    public static int longestSubarray(int[] nums , int k){

        int maxLen=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0;

        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];

            if (sum==k){
                maxLen=i+1;
            }

            if (map.containsKey(sum-k)){
                int length=i-map.get(sum-k);
                maxLen=Math.max(maxLen,length);
            }

            if (!map.containsKey(sum)){
                map.put(sum,i);
            }

        }
        System.out.println(map);
        return maxLen;
    }

}
