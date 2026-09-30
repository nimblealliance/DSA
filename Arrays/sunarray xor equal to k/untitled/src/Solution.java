import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {4, 2, 2, 6, 4};

        int k =6;
        System.out.println(subarraysWithXorK(nums,k));

    }

    public static int subarraysWithXorK(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int ans=0;
        int xor=0;
        map.put(0,1);

        for (int i = 0; i < nums.length; i++) {
            xor = xor^nums[i];

            if (map.containsKey(xor^k)){  // if there exists a subarray with xor = k , we check if there is any element in the map which is xor^k , because xor^k^k = xor , that means there is a subarray in there with k xor value
                ans+=map.get(xor^k);
            }
            map.put(xor,map.getOrDefault(xor,0)+1);
        }
        return ans;

    }




}
