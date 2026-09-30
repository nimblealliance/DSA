import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        int[] nums = {1, 9 ,3 ,10, 4 ,20 ,2};
        System.out.println(longestSequence2(nums));
    }



    public static int longestSequence2(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int longest = 1;
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        for(Integer num : set){
            if (!set.contains(num-1)){
                int count=1; //start the counter

                while (set.contains(num+1)){
                    count++;
                    num++;
                }
                longest=Math.max(count,longest);
            }
        }
        return longest;
    }



    public static int longestSequence(int[] nums) {

        Arrays.sort(nums);

        //0,3,7,2,5,8,4,6,0,1
        //0,0,1,2,3,4,5,6,7,8

        //1,2,3,4,10,20
        int count = 1;
        int longest = 1;

        if (nums.length == 0) {
            return 0;
        }

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                continue;
            }
            else if (nums[i] == nums[i-1] + 1) {
                count++;
            }
            else {
                count=1;
            }
            longest = Math.max(longest, count);
        }
        return longest;

    }
}
