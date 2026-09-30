import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {

        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumber2(nums));
    }

    public static int singleNumber2(int[] nums) {

        int xor=0;
        for (int num : nums) {
            xor ^=  num;
        }
        return xor;

    }

    public static int singleNumber(int[] nums) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        System.out.println(freq);
        for (Integer key : freq.keySet()) {
            if (freq.get(key) == 1) {
                return key;
            }
        }
        return -1;
    }


}