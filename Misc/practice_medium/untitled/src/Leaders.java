import java.util.ArrayList;
import java.util.List;

public class Leaders {

    public static void main(String[] args) {
        int[] nums = {-3, 4, 5, 1, -30, -10};
        System.out.println(leaders(nums));

    }

    public static List<Integer> leaders(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        ans.add(nums[nums.length-1]);
        int max = nums[nums.length-1];

        for (int i = nums.length-2; i >=0  ; i--) {

            if (nums[i] > max){
                ans.add(nums[i]);
                max=nums[i];
            }
        }

        return ans.reversed();

    }



}
