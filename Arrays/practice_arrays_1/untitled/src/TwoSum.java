import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

    }

    public static int[] twoSum(int[] nums , int target){

        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int remaining = target-nums[i];
            if (map.containsKey(remaining)){
                ans[0]=i;
                ans[1]=map.get(remaining);
                break;

            }

            map.put(nums[i],i);

        }
        return ans;

    }


}
