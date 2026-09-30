import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int target = 9;

        int[] nums2 = {3,2,4};
        int target2 = 6;


        System.out.println(Arrays.toString(twoSum(nums, target)));
        System.out.println(Arrays.toString(twoSum(nums2,target2)));

        System.out.println();
        System.out.println(Arrays.toString(twoSum2(nums, target)));
        System.out.println(Arrays.toString(twoSum2(nums2,target2)));
    }

    public static int[] twoSum(int[] nums , int target){

        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    break;
                }
            }
        }
        return ans;
    }


    public static int[] twoSum2(int[] nums , int target){

        HashMap<Integer , Integer> map = new HashMap<>();
        // Key is the number , value is the index
        int[] ans = new int[2];
        for(int i = 0 ; i < nums.length ; i++) {

            // nums[i] + remaining = target
            //remaining = target - nums[i]
            int remaining = target - nums[i];
            if (map.containsKey(remaining)){
                ans[0]= i;
                ans[1] = map.get(remaining);
                break;
            }
            //either way put the current element in map
            map.put(nums[i],i);
        }
        return ans;
    }
}
