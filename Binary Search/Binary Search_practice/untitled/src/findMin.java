public class findMin {


    public static void main(String[] args) {
        int[] nums = {3,1,2};
        System.out.println(findMin(nums));
    }


    public static int findMin(int[] nums){

        int low=0;
        int high= nums.length-1;
        int minValue=Integer.MAX_VALUE;

        while(low<=high){

            int mid = low +((high-low)/2);

            if (nums[low]<=nums[mid]){
                minValue=Math.min(nums[low],minValue);
                low=mid+1;
            }
            else{
                minValue=Math.min(nums[mid],minValue);
                high=mid-1;
            }

        }
        return minValue;

    }

}
