import java.util.ArrayList;
import java.util.Arrays;

public class moveZerosClass {

    public static void main(String[] args) {

        int[] nums = {0,1,0,3,12};
        moveZeroes2(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static void moveZeroes2(int[] nums) {

        int l=0;
        for (int r=0; r < nums.length ; r++ ){
            if (nums[r] != 0){
                int temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
                l++;
            }
        }

    }

    public static void moveZeroes(int[] nums) {
        ArrayList<Integer> temp = new ArrayList<>();

        for(int i=0 ; i< nums.length; i++){

            if (nums[i]!=0){
                temp.add(nums[i]);
            }
        }

        if (temp.size() < nums.length){
            int diff = nums.length-temp.size();
            for (int i = 0 ; i <=diff ; i++){
                temp.addLast(0);
            }
        }

        for (int i =0 ; i < nums.length ; i++){
            nums[i]=temp.get(i);
        }
        int[] ans = new int[temp.size()];
    }

}
