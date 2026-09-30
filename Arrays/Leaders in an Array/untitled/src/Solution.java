import java.util.ArrayList;

class Solution {

    public static void main(String[] args) {
        int nums[]= {-3, 4, 5, 1, -4, -5};
        System.out.println(leaders(nums));
    }



    public static ArrayList<Integer> leaders(int[] nums) {

        int n = nums.length;
        int leader = nums[n-1];
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0,leader);
        

        for (int i = n-1 ; i>=0 ; i--){
            if (nums[i]> leader){
                leader=nums[i];
                ans.add(0,leader);
            }
        }

        return ans;
    }
}