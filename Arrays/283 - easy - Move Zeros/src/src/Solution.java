import java.util.Arrays;

public class Solution2 {


    public static void main(String[] args) {

        int [] nums ={1,0,2,3,2,0,0,4,5,1};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));

    }


    public static void moveZeroes(int[] nums){

        int l=0;

        for (int r = 0 ; r < nums.length; r++) {
            if (nums[r]!=0 ){
                int temp=nums[r];
                nums[r]=nums[l];
                nums[l]=temp;
                l++;
            }

        }

    }

//    public static void moveZeroes(int[] nums) {
//
//        int[] temp = new int[nums.length];
//
//        for (int i=0,j=0 ; i<nums.length ; i++){
//            if (nums[i]!=0){
//                temp[j]=nums[i];
//                j++;
//            }
//        }
//
//        for(int i =0 ; i< nums.length; i++){
//            nums[i]=temp[i];
//        }
//    }
}
