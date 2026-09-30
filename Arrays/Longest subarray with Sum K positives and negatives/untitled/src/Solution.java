import java.util.HashMap;

//optimal solution if the array contains both positive and negative , Better solution when array contains only positive
//tc : O(n) , sc : o(n)
public class Solution {

    public static void main(String[] args) {
        int [] nums = {1,2,3,1,1,1,1,3,3};
        int k =6;
        System.out.println(longestSubarrayWithSumK(nums, k));
    }

    // TC is o(n) , SC is o(n)
    public static int longestSubarrayWithSumK(int [] nums , int k){
        int maxLen=0;
        int sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];

            if(sum==k){
                maxLen=i+1;

            }

            if(map.containsKey(sum-k)){
                int len=i-map.get(sum-k);
                maxLen=Math.max(maxLen,len);
            }

            if (!map.containsKey(sum)){
                map.put(sum,i);
            }

        }
        System.out.println(map);
        return maxLen;
    }


}
