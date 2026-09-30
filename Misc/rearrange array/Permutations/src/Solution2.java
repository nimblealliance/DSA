import java.util.ArrayList;
import java.util.List;

class Solution2 {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4};
        List<List<Integer>> permute = permute(nums);
        System.out.println(permute);
        System.out.println(permute.size());

    }

    public static List<List<Integer>> permute(int[] nums) {

        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backtrack(nums, temp, ans, visited);
        return ans;

    }

    public static void backtrack(int[] nums, List<Integer> temp, List<List<Integer>> ans, boolean[] visited) {

        if (temp.size() == nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (!visited[i]) {
                temp.add(nums[i]);
                visited[i]=true;
                backtrack(nums, temp , ans , visited);
                temp.remove(temp.size()-1);
                visited[i]=false;
            }
        }
    }
}