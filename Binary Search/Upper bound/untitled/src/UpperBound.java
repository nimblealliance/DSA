public class UpperBound {

    public static void main(String[] args) {
        int[] nums = {2, 3, 7, 10, 11, 11, 25};
        int x=30;
        System.out.println(upperBound(nums,x));
    }

    public static int upperBound(int[] nums, int x) {

        int low =0;
        int high = nums.length-1;
        int ans= nums.length;

        while(low<=high){

            int mid=(low+high)/2;

            if (nums[mid]>x){
                ans=mid;
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return ans;


    }


}
