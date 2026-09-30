import java.util.Arrays;

public class BinarySearch2 {

    public static void main(String[] args) {
        int[] nums= {2, 4, 6, 8, 10, 12, 14};
        int target=1;
        System.out.println(Arrays.toString(search(nums, target)));
    }

    public static int[] search(int[] nums, int target) {

        int low=0;
        int high=nums.length-1;
        int[] ans=new int[2];


        while(low<=high){

            int mid = (low+high)/2;

            if (nums[mid]<target){
                low=mid+1;
            } else if (nums[mid]>target) {
                high=mid-1;
            }else {
                 ans[0]=nums[mid];
                 ans[1]=nums[mid];
                 return ans;
            }
        }

        System.out.println(high);
        System.out.println(low);
        ans[0]= (high == -1) ? -1: nums[high];
        ans[1]= (low == -1) ? -1: nums[low];
        return ans;
    }

}
