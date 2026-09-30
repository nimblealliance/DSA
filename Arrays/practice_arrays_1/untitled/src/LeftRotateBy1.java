import java.util.Arrays;

public class LeftRotateBy1 {


    public static void main(String[] args) {
        int[] nums={-1, 0, 3, 6};
        leftRotate(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void leftRotate(int[] nums){

        int temp=nums[0];

        for (int i = 1; i < nums.length; i++) {
            nums[i-1]=nums[i];
        }

        nums[nums.length-1]=temp;

    }

}
