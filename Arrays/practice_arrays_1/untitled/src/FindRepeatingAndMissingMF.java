import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindRepeatingAndMissingMF {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 6, 7, 5, 7};
        System.out.println(Arrays.toString(missingAndRepeating(nums)));
    }


    public static int[] missingAndRepeating(int[] nums){

        HashMap<Integer,Integer> map = new HashMap<>();
        int xor1=0;
        int xor2=0;

        int[] res = new int[2];

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {

            if (entry.getValue()==1){
                xor1=xor1^ entry.getKey();
            }
            if(entry.getValue()==2){
                res[0]=entry.getKey();
                xor1=xor1^ entry.getKey();
            }

        }

        for (int i = 0; i <= nums.length ; i++) {
            xor2=xor2^i;
        }

        res[1]=xor1^xor2;

        return res;










    }



}
