import java.util.ArrayList;
import java.util.List;

public class Permutations {


    public static void main(String[] args) {

        int[] nums = {1,2,3};
        System.out.println(permutations(nums));


    }

    public static List<List<Integer>> permutations(int[] nums){

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> permute = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backTrack(nums,permute,ans,visited);
        return ans;
    }

    public static void backTrack(int[] nums , List<Integer> permute , List<List<Integer>> ans , boolean[] visited){

        if(permute.size()== nums.length) {
            ans.add(new ArrayList<>(permute));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if(!visited[i]){
                permute.add(nums[i]);
                visited[i]=true;
                backTrack(nums, permute, ans,visited);
                permute.removeLast();
                visited[i]=false;
            }
        }
    }


}
