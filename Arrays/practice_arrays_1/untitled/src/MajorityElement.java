import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {

        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));

    }

    public static int majorityElement(int[] nums){

        int count=0;
        int majorityElement=0;


        for (int i = 0; i < nums.length; i++) {

            if (count==0){
                count=1;
                majorityElement=nums[i];

            } else if (nums[i]==majorityElement) {
                count++;
            }
            else{
                count--;
            }
        }
        return majorityElement;
    }


    public static int majorityElement2(int[] nums){

        int majorityElement=0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int n = nums.length/2;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue()>n){
                majorityElement=entry.getKey();
            }

        }
        return majorityElement;

    }

}
