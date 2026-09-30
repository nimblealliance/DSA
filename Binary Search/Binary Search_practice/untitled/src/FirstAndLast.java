import java.util.Arrays;

public class FirstAndLast {

    public static void main(String[] args) {

        int[] nums = {5, 7, 7, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(firstAndLast(nums,target)));

    }

    public static int[] firstAndLast(int[] nums , int target){

        int[] ans = new int[2];

        //first find lower bound == first occurrence

        int low=0;
        int high= nums.length-1;
        int first=-1;

        while(low<=high){

            int mid=low +((high-low)/2);

            if(nums[mid]==target){
                first=mid;
                high=mid-1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        ans[0]=first;

        // then find the upper bound == last occurrence
        low=0;
        high= nums.length-1;
        int last=-1;

        while(low<=high){

            int mid=low +((high-low)/2);

            if(nums[mid]==target){
                last=mid;
                low=mid+1;
            } else if (nums[mid]>target){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        ans[1]=last;

        return ans;
    }
}
