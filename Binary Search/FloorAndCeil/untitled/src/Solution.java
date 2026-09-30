import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {2,4,6,8,10,12,14};
        int x=1;
        System.out.println(Arrays.toString(getFloorAndCeil(nums,x)));
    }

    public static int[] getFloorAndCeil(int[] nums, int x) {

        int[] ans = new int[2];
        int floor=-1;
        int ceil=-1;


        int low=0;
        int high= nums.length-1;

        while(low<=high){

            int mid=(low+high)/2;

            if (nums[mid]>=x){
                ceil=nums[mid];
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

         low=0;
         high= nums.length-1;


        while(low<=high) {
            int mid = (low + high) / 2;

            if (nums[mid] <= x) {
                floor = nums[mid];
                low = mid + 1;
            } else {
                high = mid - 1;

            }
        }

        ans[0]=floor;
        ans[1]=ceil;
        return ans;

    }


}
