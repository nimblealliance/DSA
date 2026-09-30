import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination2 {
    public static void main(String[] args) {
        int[] nums ={2, 5, 2, 1, 2};
        int target = 5;
        System.out.println(combinationSum2(nums,target));
    }


    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
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
        generateAllCombinationofSum(candidates , ind+1 , sum , target , combi , ans);
        sum-=candidates[ind];
        combi.remove(combi.size()-1);

        generateAllCombinationofSum(candidates , ind+1 , sum , target , combi , ans);
    }

}
