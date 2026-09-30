import java.util.Arrays;

public class NextPermutations {

    public static void main(String[] args) {

        int[] nums = {1,3,2};
        int[] nums2 = {2,1,5,4,3,0,0};
        int[] nums3 = {9,10,8,11,3};
        nextPermute(nums);
        nextPermute(nums2);
        nextPermute(nums3);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.toString(nums3));



    }


    public static void nextPermute(int[] nums){

        int ind=-1;

        for (int i = nums.length-2; i >=0 ; i--) {
            if (nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }

        if (ind == -1){
            //handle this later , just reverse the given array and return
            reverse(nums , 0 , nums.length-1);
            return;
        }

        for (int i = nums.length-1; i >0 ; i--){
            if (nums[i]>nums[ind]){
                swap(nums , ind , i);
                break;
            }

        }

        reverse(nums , ind+1 , nums.length-1);

    }

    public static void swap (int[] nums , int i , int j){
        int temp = nums[j];
        nums[j]=nums[i];
        nums[i]=temp;

    }

    public static void reverse (int[] nums , int start  , int end){
        while (start <=end){
            swap(nums , start , end);
            start++;
            end--;
        }
    }
}
