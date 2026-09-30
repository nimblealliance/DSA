import java.util.Arrays;

class Solution {

    public static void main(String[] args) {

        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }


    public static int removeDuplicates(int[] nums) {

        int l=1;
        for (int r=1 ; r < nums.length ; r++){
            if (nums[l-1]!=nums[r]){
                nums[l]=nums[r];
                l++;
            }
        }
        return l;
    }
}