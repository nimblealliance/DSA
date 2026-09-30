import java.util.Arrays;

public class Solution2 {

    public static void main(String[] args) {
        int[] nums={2};
        int target=1;
        System.out.println(Arrays.toString(searchRange(nums, target)));



    }

    public static int[] searchRange(int[] nums , int target){


        int lb = lowerBound(nums,target);
        if (lb==nums.length || nums[lb]!=target){
            return new int[]{-1,-1};
        }
        int ub=upperBound(nums,target);

        return new int[]{lb,ub};

    }


    public static int lowerBound(int[] nums , int target){

        int low=0;
        int high=nums.length-1;
        int ans= nums.length;
        while(low<=high){
            int mid=low+((high-low)/2);

            if(nums[mid]>=target){
                ans=mid;
                high=mid-1;

            } else{
                low=mid+1;
            }
        }

        return ans;
    }


    public static int upperBound(int[] nums , int target){

        int low=0;
        int high=nums.length-1;
        int ans= nums.length;
        while(low<=high){
            int mid=low+((high-low)/2);

            if(nums[mid]>target){
                ans=mid;
                high=mid-1;

            } else{
                low=mid+1;
            }
        }

        return ans-1;
    }

}
