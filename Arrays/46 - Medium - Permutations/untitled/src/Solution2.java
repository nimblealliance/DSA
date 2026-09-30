import java.util.ArrayList;
import java.util.List;

class Solution2 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] visited= new boolean[nums.length];
        recursivePermutation(nums,ans,ds,visited);
        return ans;
    }


    public static void recursivePermutation(int [] nums , List<List<Integer>> ans,List<Integer> ds ,boolean[] visited) {
        if (ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i=0 ; i<nums.length ; i++){
            if (!visited[i]){
                visited[i]=true;
                ds.add(nums[i]);
                recursivePermutation(nums,ans,ds,visited);
                ds.remove(ds.size()-1);
                visited[i]=false;
            }
        }
    }

}