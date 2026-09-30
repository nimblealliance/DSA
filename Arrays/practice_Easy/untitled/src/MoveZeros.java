import java.util.Arrays;

public class MoveZeros {


    public static void main(String[] args) {
        int[] nums = {0};
        moveZeros(nums);
    }

    public static void moveZeros(int[] nums){

        int i=0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j]!=0){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }



}
