import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement2 {

    public static void main(String[] args) {

        int[] nums = {1, 2, 1, 1, 3, 2, 2};
        System.out.println(majorityElement2(nums));
    }


    public static List<Integer> majorityElement2(int[] nums){

        int n = nums.length/3;
        List<Integer> ans = new ArrayList<>();

        int count1=0;
        int count2=0;
        int num1= Integer.MAX_VALUE;
        int num2= Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (count1 ==0 && nums[i]!=num2){
                count1=1;
                num1=nums[i];
            } else if (count2 ==0 && nums[i]!=num1) {
                count2=1;
                num2=nums[i];
            } else if (nums[i]==num1) {
                count1++;
            } else if (nums[i]==num2) {
                count2++;
            } else{
                count1--;
                count2--;
            }
        }

        int countAgain=0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==num1){
                countAgain++;
            }
        }

        if (countAgain > n){
            ans.add(num1);
        }

        countAgain=0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==num2){
                countAgain++;
            }
        }

        if (countAgain > n){
            ans.add(num2);
        }

        return ans;
    }

    public static List<Integer> majorityElement3(int[] nums){

        int n= nums.length/3;
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue() > n){
                ans.add(entry.getKey());
            }
        }
        return ans;
    }
}
