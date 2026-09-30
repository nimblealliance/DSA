import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
//
//        int[] nums2={1,1,2};
//        System.out.println(removeDuplicates(nums2));
//        System.out.println(Arrays.toString(nums2));


    }

    public static int removeDuplicates(int[] nums){

        int i = 1;
        for (int j = i; j < nums.length; j++) {

            if (nums[i-1]!=nums[j]){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }

}
