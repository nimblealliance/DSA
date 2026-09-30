import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {

        int[] nums = {2,2,1,1,1,2,2};
        int[] nums2= {3,2,3};

        System.out.println(majorityElement2(nums2));
    }

    public static int majorityElement2(int[] nums){
        
        int count=0;
        int maxnum=0;

        for (int i = 0; i < nums.length; i++) {

            if (count==0){
                count+=1;
                maxnum=nums[i];
            } else if (nums[i]==maxnum) {
                count++;
            }else{
                count--;
            }

        }
        return maxnum;
    }

    public static int majorityElement(int[] nums){

        int ans=0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0 ; i < nums.length ; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int n = nums.length/2;

        for (Map.Entry<Integer, Integer> x :  map.entrySet()){
            if ( x.getValue() > n){
                ans=x.getKey();
            }
        }
        return ans;
    }

}
