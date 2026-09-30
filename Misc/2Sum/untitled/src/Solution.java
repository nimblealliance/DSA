import java.util.Arrays;
import java.util.HashMap;

class Solution {

    public static void main(String[] args) {

        int[] nums={1, 3, 5, -7, 6, -3};
        int target=0;
        System.out.println(Arrays.toString(twoSum(nums,target)));

    }


    public static int[] twoSum(int[] nums, int target) {

        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        // Key is the number , value is the index

        for (int i = 0; i < nums.length; i++) {
            int remaining = target - nums[i];
            // int[i] + remaining = target
            //remaining = target - int[i]
            if (map.containsKey(remaining)) {
                ans[0] = i;
                ans[1] = map.get(remaining);
                break;
            }
            map.put(nums[i], i);
        }
        Arrays.sort(ans);
        return ans;
    }

}