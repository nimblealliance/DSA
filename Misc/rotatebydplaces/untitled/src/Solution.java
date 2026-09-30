import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        int k=3;

        rotateRight(nums,k);
        rotateLeft(nums,k);
        System.out.println(Arrays.toString(nums));



    }

    public static void rotateRight(int[] nums, int k){

        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);

    }


    public static void rotateLeft(int [] nums , int k){
        k=k%nums.length;

        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        reverse(nums,0,nums.length-1);
    }

    public static void reverse(int [] nums , int start , int end){
        while(start < end){
            int temp = nums[end];
            nums[end]=nums[start];
            nums[start]=temp;
            start++;
            end--;
        }
    }



}
