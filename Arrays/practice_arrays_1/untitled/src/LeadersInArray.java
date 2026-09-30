import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {

    public static void main(String[] args) {
        int[] nums={-3, 4, 5, 1, -4, -5};
        System.out.println(leaders(nums));
    }

    public static List<Integer> leaders(int[] nums){
        List<Integer> ans = new ArrayList<>();
        ans.add(nums[nums.length-1]);
        int leader=nums[nums.length-1];
        for (int i = nums.length-2; i >=0 ; i--) {

            if (nums[i]>leader){
                leader=nums[i];
                ans.add(nums[i]);
            }
        }
        return ans.reversed();
    }
}
