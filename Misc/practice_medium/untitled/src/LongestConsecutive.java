import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutive {

    public static void main(String[] args) {
        int[] nums = {1,0,1,2};
        System.out.println(longestConsecutive2(nums));
    }

    public static int longestConsecutive2(int[] nums){
        int longest=1;

        HashSet<Integer> set = new HashSet<>();

        for (int j : nums) {
            set.add(j);
        }


        for(Integer num : set){

            if (!set.contains(num-1)){
              int count=1;
              int currentnum=num;

              while(set.contains(currentnum+1)){
                  count++;
                  currentnum++;
              }
              longest=Math.max(count,longest);

            }
        }
        return longest;
    }


    public static int longestConsecutive(int[] nums){

        if (nums.length==0){
            return 0;
        }

        int ans=1;
        Arrays.sort(nums);
        int length=1;
        int lastNum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i]-1==lastNum){
                length++;
                lastNum=nums[i];
            } else if (nums[i] != lastNum) {
                length=1;
                lastNum=nums[i];
            }
            ans = Math.max(ans,length);
        }
        return ans;
    }
}
