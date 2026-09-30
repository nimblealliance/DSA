import java.util.*;

class Solution {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1, 3};
        int[] nums2 = {5,5,5,5,1};
        System.out.println(countFrequencies(nums2));
    }


    public static List<List<Integer>> countFrequencies(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0 ; i<nums.length ; i++){
            map.put(nums[i],map.getOrDefault((nums[i]),0)+1);
        }

        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for(Map.Entry<Integer, Integer> entry : entries){
            List<Integer> intermediate = new ArrayList<>();
            intermediate.add(entry.getKey());
            intermediate.add(entry.getValue());
            ans.add(intermediate);
        }
        return ans;
    }
}