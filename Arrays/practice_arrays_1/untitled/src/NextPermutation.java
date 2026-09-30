import java.util.Arrays;

public class NextPermutation {

    public static void main(String[] args) {
        int[] nums = {2,1,5,4,3,0,0};
        nextPermute(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void nextPermute(int[] nums){

        int breakPoint=-1;

        //from the right , find the number which is smaller than the next number and make it as breakpoint index
        for(int i= nums.length-2 ; i>= 0 ; i--){

            if (nums[i] < nums[i+1]){
                breakPoint=i;
                break;
            }
        }

        //if breakpoint is -1 after the above ops , it means the array is sorted in descending fashion , eg , 5,4,3,2,1 , so the only next permutation possible is
        //1,2,3,4,5 , so we just reverse the entire array
        if (breakPoint==-1){

            reverse(nums,0,nums.length-1);
            return;
        }


        //if breakpoint is found , we find the smallest biggest element that is greater than the breakpoint element , so that we can be near , if we take larger numbers
        // the result will be farthest from the initial array , so we want some number which is only slightly bigger than the breakpoint number
        for (int i= nums.length-1 ; i>= 0 ; i--){
            if (nums[i]>nums[breakPoint]){
                swap(nums,i,breakPoint);
                break;
            }
        }

        //once all that is done , reverse the array from breakpoint+1 till the end to get the smallest greatest permutation of the input
        reverse(nums,breakPoint+1,nums.length-1);


    }


    public static void swap(int[] nums , int i , int j){

        int temp=nums[j];
        nums[j]=nums[i];
        nums[i]=temp;

    }

    public static void reverse(int[] nums , int start , int end){

        while(start <= end){
            swap(nums, start,end);
            start++;
            end--;
        }
    }


}
