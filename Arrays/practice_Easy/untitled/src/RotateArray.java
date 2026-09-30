import java.util.Arrays;

public class RotateArray {


    public static void main(String[] args) {

        int[] nums ={2, 3, 4, 5,1};
        int k=2;
//        leftByOne(nums);
        System.out.println(Arrays.toString(nums));
        leftByK(nums,k);
        rightByK(nums,k);
    }

    public static void leftByK(int[] nums, int k){

        k=k% nums.length;
        reverse(nums, 0,k-1);
        reverse(nums,k, nums.length-1);
        reverse(nums,0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    public static void  rightByK(int[] nums , int k){

        k=k% nums.length;
        reverse(nums,0, nums.length-1);
        reverse(nums , 0 , k-1);
        reverse(nums , k , nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    public static void reverse(int[] nums , int start , int end){

        while (start <= end){
            int temp = nums[end];
            nums[end]=nums[start];
            nums[start] = temp;
            start++;
            end--;
        }
    }

    public static void leftByOne(int[] nums){

        int first=nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i-1]=nums[i];
        }

        nums[nums.length-1]=first;
        System.out.println(Arrays.toString(nums));
    }
}
