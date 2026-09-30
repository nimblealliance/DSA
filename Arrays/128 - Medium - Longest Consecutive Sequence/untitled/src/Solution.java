import java.util.Arrays;
import java.util.HashSet;

class Solution {

    public static void main(String[] args) {

        int [] nums = {9,1,4,7,3,-1,0,5,8,-1,6};
        System.out.println(longestConsecutive2(nums));

    }

    public static int longestConsecutive2(int[] nums) {
        if (nums.length==0){
            return 0;
        }

        int longest=0;
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        //we put every element to the set , in java the set is ordered and doesn't allow duplicates.
        for(Integer x : set){
            //what we search for is if the set contains num - 1 somewhere , if it does that means the current num is a part of the sequence but we don't know if
            // it's the start , the mid or the end of the sequence , so we ignore it
            //what we look for is a num which doesn't have num-1 in set , that way we can say the num can be at the start of a sequence.
            // if we do not find num-1 in set , we take that num as the start of the sequence and continue checking the set for (num+1) and increasing
            //the streak , if we keep finding num+1 in the set we keep increasing the streak of sequence's value , once we do not find a num+1 in the set
            //that's when the sequence has ended.

            if(!set.contains(x-1)){
               int currentNum=x;
               int currentStreak=1;

               while(set.contains(currentNum+1)){
                   currentNum++;
                   currentStreak++;
               }

               longest=Math.max(longest,currentStreak);

            }
        }

        return longest;
    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length==0){
            return 0;
        }

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int previousNum=Integer.MIN_VALUE;
        int length=1;
        int currCount=0;
        for(int i =0 ; i < nums.length ; i++){
            if(nums[i]-1 ==previousNum){
                // if the current num - 1 is equal to previous number we saw in array , increase the count and the current number becomes the new previous
                // number since we are in a streak of numbers in sequence.
                currCount++;
                previousNum=nums[i];
            }

            else if (nums[i]!=previousNum){
                // if the current num is not equal to previous num , that means we maybe at the start of a new sequence , so previous num gets updated to the
                //current num and count starts from 1 denoting the start of a sequence
                currCount=1;
                previousNum = nums[i];
            }

            // if nums[i]==previous num , we have repeated numbers eg . 1 , 1, 1 , so we can ignore them so no condition written for it.

            length=Math.max(length,currCount);
        }
        return length;
    }
}