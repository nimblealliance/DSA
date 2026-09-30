import java.util.Arrays;
import java.util.HashSet;

public class Solution {

    public static void main(String[] args) {

        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive2(nums));
    }


    public static int longestConsecutive2(int[] nums){

        if (nums.length==0){
            return 0;
        }
        HashSet<Integer> hashSet = new HashSet<>();
        int longest=1;
        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
        }
        System.out.println(hashSet);

        for (Integer i : hashSet){
            if (!hashSet.contains(i-1)){
                int count= 1;
                int currentNum = i;

                while(hashSet.contains(currentNum+1)){
                    count++;
                    currentNum++;
                }
                longest = Integer.max(count, longest);
            }
        }
        return longest;
    }



    public static int longestConsecutive(int[] nums){
        int longest=1;
        int count=1;
        Arrays.sort(nums);
        int lastNum=Integer.MIN_VALUE; // represents the start of a sequence in the beginning

        if (nums.length==0){
            return 0;
        }

        for (int i = 0; i < nums.length; i++) {

            if (nums[i]-1 == lastNum){
                // if the value of (nums[i]-1) is the last num , we are in a sequence , so increase the counter and update the last num
                count++;
                lastNum=nums[i];
            } else if (nums[i] != lastNum) {
                //this is where you start a new sequence because last num and num[i] aren't part of a sequence so you start counting a new sequence from the current nums[i]
                count=1;
                lastNum=nums[i];

            }
            longest = Integer.max(count, longest);
        }
        return longest;

    }

}
