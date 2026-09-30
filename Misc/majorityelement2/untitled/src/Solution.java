import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {0,0,0};
//        majorityElement(nums);
        System.out.println(majorityElement2(nums));
    }

    public static List<Integer> majorityElement2(int[] nums) {
        int count1=0;
        int count2=0;
        int element1=Integer.MAX_VALUE;
        int element2=Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (count1 ==0 && element2 != nums[i]){
                count1=1;
                element1=nums[i];
            } else if (count2==0 && element1 !=nums[i]) {
                count2=1;
                element2=nums[i];
            } else if (nums[i]==element1) {
                count1++;
            } else if (nums[i]==element2) {
                count2++;
            }else {
                count1--;
                count2--;
            }
        }

        List<Integer> ans = new ArrayList<>();
        System.out.println(count1);
        System.out.println(count2);
        int countAgain=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == element1) {
                countAgain++;
            }
        }
        if (countAgain> nums.length/3){
            ans.add(element1);
        }

        countAgain=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == element2){
                countAgain++;
            }
        }
        if (countAgain> nums.length/3){
            ans.add(element2);
        }
        return ans;

    }

    public static List<Integer> majorityElement(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> ans = new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue()> nums.length/3){
                ans.add(entry.getKey());
            }
        }
        return ans;

    }
}
