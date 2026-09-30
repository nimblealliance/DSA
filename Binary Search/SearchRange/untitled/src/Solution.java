import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        int[] nums={5,7,7,8,8,10};
        int target=8;
        System.out.println(Arrays.toString(searchRange(nums,target)));


    }

    public static int[] searchRange(int[] nums , int target){

            int[] ans = new int[2];

            ans[0]=findFirst(nums,0 , nums.length - 1 , target);
            ans[1]=findLast(nums, 0 , nums.length - 1 , target);

            return ans;

    }


    public static int findFirst(int[] nums , int low , int high, int target){
        int index=-1;


        while(low <=high){
            int mid=low+((high-low)/2);

            if (nums[mid]==target){
                index=mid;
                high=mid-1;
            } else if (nums[mid]>target) {
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return index;
    }


    public static int findLast(int[] nums , int low , int high, int target){

        int index=-1;


        while(low <=high){
            int mid=low+((high-low)/2);

            if (nums[mid]==target){
                index=mid;
                low=mid+1;
            } else if (nums[mid]>target) {
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return index;
    }


}



