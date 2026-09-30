import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int length = removeDuplicates(nums);
        System.out.println(length);
        System.out.println(Arrays.toString(nums));
    }

    static int removeDuplicates(int[] nums){

        //{0,0,1,1,1,2,2,3,3,4}
        int l = 1;

        for (int r = 1 ; r < nums.length ; r++ ){
            if ( nums[r-1] != nums[r]){
                nums[l] = nums[r];
                l++;
            }
        }
        return l;

    }

}
