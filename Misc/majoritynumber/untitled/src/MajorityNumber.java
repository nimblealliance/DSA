import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MajorityNumber {

    public static void main(String[] args) {
        int[] nums ={3,1};
        System.out.println(majorityNumber2(nums));
    }

    public static int majorityNumber2(int[] nums){
         int ans=0;
         int count=0;

         for(int i=0 ; i< nums.length ; i++){

             if (count ==0){
                 ans=nums[i];
                 count++;
             } else if (nums[i]==ans) {
                 count++;
             }else{
                 count--;
             }
         }
         return ans;
    }


    public static int majorityNumber(int[] nums){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0 ; i<nums.length ; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();

        for(Map.Entry<Integer, Integer> entry : entries){
            if (entry.getValue() > nums.length/2){
                return entry.getKey();
            }
        }
        return 0;
    }

}
