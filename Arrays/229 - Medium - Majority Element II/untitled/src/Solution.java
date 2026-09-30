import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {

    public static void main(String[] args) {

        int[] nums = {2,2};
        System.out.println(majorityElement2(nums));
    }



    public static List<Integer> majorityElement2(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int reqCount=nums.length/3+ 1;

        for(int i=0 ; i < nums.length ; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if (map.get(nums[i])== reqCount){
                ans.add(nums[i]);
            }
        }
        return ans;

    }

    public static List<Integer> majorityElement(int[] nums) {

        List<Integer> ans = new ArrayList<>();
        int reqCount=nums.length/3;

        for(int i=0 ; i < nums.length ; i++){
            int count=0;
            for(int j=0 ; j< nums.length ; j++){
                if (nums[i]==nums[j]){
                    count++;
                }
            }

            if (count > reqCount && !ans.contains(nums[i])){
                ans.add(nums[i]);
            }
        }

        return ans;
    }
}