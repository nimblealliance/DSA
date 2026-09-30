import java.util.HashMap;

public class longestSubarrayAll {


    public static void main(String[] args) {
        int [] nums ={2,1,45,-45,27384,-27384,44,55,48,22};
        int k =100;
        System.out.println(longestSubarray(nums,k));

    }

    public static int longestSubarray(int[] nums , int k){

        // {2,1,45,-45,27384,-27384,44,55,48,22} ; k = 100
        //hashmap -> sum , index
        //  2,0
        //3 , 1
        //48 , 2
        //3 , 3
        //27387 , 4
        // 3 , 5


        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0;
        int maxLen=0;
        for (int i = 0; i < nums.length; i++) {

            sum+=nums[i];

            if (map.containsKey(sum-k)){
                //102-100=2
                int len=i-map.get(sum-k)+1;
                maxLen= Math.max(len,maxLen);

            }

            if(!map.containsKey(sum)){
                map.put(sum,i);
            }

        }
        System.out.println(map);

        return maxLen;
    }
}
