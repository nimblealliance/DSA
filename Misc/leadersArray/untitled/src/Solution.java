import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

        int[] nums = {1,2,5,3,1,2};
        System.out.println(leaders(nums));


        int[] nums2 = {-3, 4, 5, 1, -4, -5};
        System.out.println(leaders(nums2));
    }

    public static List<Integer> leaders(int[] nums) {

        List<Integer> leader = new ArrayList<>();

        leader.add(nums[nums.length-1]);
        int max = nums[nums.length-1] ;

        for (int i = nums.length-2 ;  i >= 0 ; i--) {

            if (nums[i]>max){
                leader.add(nums[i]);
                max=nums[i];
            }
        }
        return leader.reversed();
    }

}
