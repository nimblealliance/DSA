public class BinarySearch {


    public static void main(String[] args) {
        int[] nums= {1,2,8,10,10,12,19};
        int target=11;
        System.out.println(search(nums,target));
    }

    public static int search(int[] nums, int target) {

        int low=0;
        int high=nums.length-1;

        while(low<=high){

            int mid = (low+high)/2;

            if (nums[mid]<target){
                low=mid+1;
            } else if (nums[mid]>target) {
                high=mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    
}
