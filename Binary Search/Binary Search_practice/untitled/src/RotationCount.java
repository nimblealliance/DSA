public class RotationCount {

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        System.out.println(findKRotation(nums));
    }

    public static int findKRotation(int[] nums){

        int low=0;
        int high= nums.length-1;
        int minValue=Integer.MAX_VALUE;
        int index=-1;


        while(low<=high){

            int mid = low+((high-low)/2);

            if (nums[low]<=nums[mid]){

                if (nums[low]<=minValue){
                    minValue=nums[low];
                    index=low;
                }
                low=mid+1;
            }else{
                if (nums[mid]<=minValue){
                    minValue=nums[mid];
                    index=mid;
                }
                high=mid-1;
            }
        }
        return index;
    }

}
