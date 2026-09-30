import java.util.HashMap;

class Solution {

    public static void main(String[] args) {


//        System.out.println(longestSubarray(new int[] {1,2,3,0,1,1,1}, 3));
        System.out.println(longestSubarrayOnlyPositives(new int[] {1,2,3,1,1,1}, 3));
    }

    public static int longestSubarrayOnlyPositives(int[] nums, int k) {

        int maxLen=0;
        int sum=0;
        int left=0;


        for (int right = 0; right < nums.length; right++) {

            sum+=nums[right];


            while (left <= right && sum >k){
                sum-=nums[left];
                left++;
            }

            if (sum ==k){
                maxLen = Math.max(maxLen,right-left+1);
            }

        }
        return maxLen;
    }

    public static int longestSubarray(int[] nums, int k) {

        int sum=0;
        int maxLen=0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i=0; i < nums.length; i++){

            sum+=nums[i];

            if (sum ==k){
                maxLen = i+1;
            }

            if(map.containsKey(sum-k)){
                int length = i - map.get(sum-k);
                maxLen = Math.max(maxLen,length);
            }

            if (!map.containsKey(sum)){
                map.put(sum,i);
            }

        }

        return maxLen;
    }
}