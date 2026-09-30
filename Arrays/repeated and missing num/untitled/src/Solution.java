import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {

        int[] nums = {4,3,6,2,1,1};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(findMissingRepeatingNumbers(nums)));
    }


    public static int[] findMissingRepeatingNumbers(int[] nums) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] ans = new int[2];

        int n = nums.length;
        int xor1 = 0;
        int xor2=0;

        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() == 1) {
                xor1 = xor1 ^ entry.getKey();
            }
            if (entry.getValue() == 2) {
                ans[0] = entry.getKey();
                xor1 = xor1 ^ entry.getKey();
            }
        }

        for(int i=1 ; i<=n ; i++){
            xor2=xor2^i;
        }

        ans[1] = xor1^xor2;
        return ans;
    }


}
