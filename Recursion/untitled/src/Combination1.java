import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {

        int[] nums = {2};
        int target = 1;
        System.out.println(combinationSum(nums, target));


    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<Integer> combi = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        generateAllCombinationofSum(candidates , 0 , 0 , target , combi , ans);
        return ans;
    }

    public static void generateAllCombinationofSum(int[] candidates , int ind , int sum , int target , List<Integer> combi , List<List<Integer>> ans){
        if(sum == target){
            ans.add(new ArrayList<>(combi));
            return;
        }

        if(ind == candidates.length || sum > target){
            return;
        }

        sum += candidates[ind];
        combi.add(candidates[ind]);
        generateAllCombinationofSum(candidates , ind , sum , target , combi , ans);
        sum-=candidates[ind];
        combi.remove(combi.size()-1);

        generateAllCombinationofSum(candidates , ind+1 , sum , target , combi , ans);
    }

}