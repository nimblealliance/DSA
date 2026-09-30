import java.util.Arrays;
import java.util.HashMap;

class Solution {

    public static void main(String[] args) {

        int[] nums = {2,6,5,8,11};
        int target = 14;
        System.out.println(Arrays.toString(twoSum(nums,target)));

    }

//    public static int[] twoSum(int[] nums, int target) {
//        int[] answer = new int[2];
//        for(int i = 0 ; i < nums.length ; i++){
//
//            for(int j=i+1 ; j<nums.length; j++){
//                if (nums[i]+nums[j] == target){
//                    answer[0]=i;
//                    answer[1]=j;
//                    break;
//                }
//            }
//
//        }
//        return answer;
//    }


    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for(int i = 0 ; i < nums.length ; i++){
            int remaining = target-nums[i];
            if (map.containsKey(remaining)){
                ans[0]=i;
                ans[1]=map.get(remaining);
                System.out.println(map);
                return ans;
            }
            map.put(nums[i],i);
        }

        return ans;
    }
}