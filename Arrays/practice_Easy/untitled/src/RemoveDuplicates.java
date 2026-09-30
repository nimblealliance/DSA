import java.util.Arrays;

public class RemoveDuplicates {


    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}));
    }

    public static int removeDuplicates(int[] nums){


        int l=1;

        for (int r = 1; r < nums.length; r++) {

            if(nums[r]!=nums[l-1]){
                nums[l]=nums[r];
                l++;
            }

        }
        System.out.println(Arrays.toString(nums));
        return l;

    }

}
