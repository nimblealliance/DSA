import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {

        int[] nums={1,2,3};
        System.out.println(permute(nums));

    }


    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backTrack(nums,ans,temp,visited);
        return ans;

    }


    public static void backTrack(int[] nums , List<List<Integer>> ans , List<Integer> temp , boolean[] visited  ){

        if (temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (!visited[i]){

                temp.add(nums[i]);
                visited[i]=true;
                backTrack(nums,ans,temp,visited);
                visited[i]=false;
                temp.removeLast();
            }
        }
    }

}
