import java.util.HashMap;

public class XorSumK {

    public static void main(String[] args) {
        int[] nums= {5,2,9};
        int k = 7;
        System.out.println(subarraysWithXorK(nums,k));
    }

    public static int subarraysWithXorK(int[] nums, int k) {
        int count=0;
        int xor=0;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i = 0; i < nums.length; i++) {

            xor = xor^nums[i];
            if (map.containsKey(xor^k)){
                count+=map.get(xor^k);
            }

            map.put(xor , map.getOrDefault(xor,0)+1);


        }
        System.out.println(map);
        return count;


    }

}
