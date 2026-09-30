import java.util.Arrays;

class Solution {

    public static void main(String[] args) {

        int[] nums = {2,1,5,4,3,0,0};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));

    }


    public static void nextPermutation(int[] nums) {
        int ind = -1;

        int n = nums.length;

        for (int i = n-2 ; i >=0 ; i--){
            if (nums[i] < nums[i+1]){
                ind = i;
                break;
            }
        }

        if (ind == -1){
            reverse(nums,0,n-1);
            return;
        }

        for (int i = n-1 ; i > ind ; i--){
            if (nums[i] > nums[ind]){
                swap (nums , i , ind);
                break;
            }
        }
        reverse(nums , ind+1 , n-1);
    }

    public static void swap(int[] nums , int x , int y){
        int temp = nums[y];
        nums[y]=nums[x];
        nums[x]= temp;
    }

    public static void reverse(int[] nums , int start , int end){

        while (start <= end){
            swap(nums , start ,end);
            start++;
            end--;
        }
    }
}