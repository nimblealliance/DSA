import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        try{
            System.out.println(permute(nums));
        }catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] visited= new boolean[nums.length];
        backTrack(nums , path, ans, visited);
        return ans;
    }

    public static void backTrack(int[] nums ,List<Integer> path, List<List<Integer>> ans ,boolean[] visited ){

        if(path.size()==nums.length){
            ans.add(new ArrayList<>(path));
            System.out.println(path);
            return;
        }
        for (int i=0 ; i<nums.length ; i++){
            if (visited[i]==false){
                path.add(nums[i]);
                visited[i]=true;
                backTrack(nums,path,ans ,visited);
                path.remove(path.size()-1);
                visited[i]=false;
            }
        }
    }
}