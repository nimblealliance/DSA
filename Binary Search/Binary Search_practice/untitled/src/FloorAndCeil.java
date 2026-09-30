import java.util.Arrays;

public class FloorAndCeil {

    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 10, 12, 14};
        int x=1;

        System.out.println(Arrays.toString(floorAndCeil(nums,x)));
    }

    public static int[] floorAndCeil(int[] nums , int target){

        int[] ans = new int[2];

        int low=0;
        int high= nums.length-1;
        int floor=-1;

        while(low<=high){

            int mid=low+((high-low)/2);

            if (nums[mid]<=target){
                floor=nums[mid];
                low=mid+1;

            }else{
                high=mid-1;
            }
        }
        ans[0]=floor;

        low=0;
        high= nums.length-1;
        int ceil=-1;

        while(low<=high){

            int mid=low+((high-low)/2);

            if (nums[mid]>=target){
                ceil=nums[mid];
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        ans[1]=ceil;

        return ans;
    }
}
