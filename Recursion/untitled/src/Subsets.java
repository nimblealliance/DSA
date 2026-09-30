import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        subsets(nums);
//        System.out.println(subsets(nums));
    }


    public static List<List<Integer>> subsets(int[] nums) {

        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        generateSubsets(nums , 0 , temp , ans );
        return ans;
    }

    public static void generateSubsets(int[] nums , int ind , List<Integer> temp , List<List<Integer>> ans){

        if(ind == nums.length){
            System.out.println(temp);
            ans.add(new ArrayList<>(temp));
            return ;
        }

        //don't pick
        generateSubsets(nums , ind+1 , temp , ans);

        //pick
        temp.add(nums[ind]);
        generateSubsets(nums , ind+1, temp , ans);

        //backtrack
        temp.remove(temp.size()-1);
    }

}


