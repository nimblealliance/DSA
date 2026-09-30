public class lower_bound {

    public static void main(String[] args) {
        int[] nums = {3,5,8,15,19};
        int x=9;

        System.out.println(lowerBound(nums,x));
    }



    public static int lowerBound(int[] nums , int target){

        int ans= nums.length;

        int low=0;
        int high= nums.length-1;

        while(low<=high){

            int mid = low + ((high-low)/2);

            if (nums[mid]>=target){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }

}
