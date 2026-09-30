public class upper_bound {

    public static void main(String[] args) {

    }

    public static int upperBound(int[] nums , int target){

        int n = nums.length;
        int ans = nums.length;

        int low=0;
        int high=n-1;

        while(low<=high){

            int mid = low + ((high-low)/2);

            if (nums[mid]>target){
                ans=mid;
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return ans;
    }
}
