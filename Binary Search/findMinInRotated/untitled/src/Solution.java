class Solution {

    public static void main(String[] args) {
        int [] nums = {11,12,13,15,17};
        int [] nums2 = {4,5,6,7,0,1,2};
        int [] nums3 = {0,1,2,3,4,5,6,7};
        int [] nums4 = {3,4,5,1,2};
        int [] nums5 = {5,1,2,3,4};

        System.out.println(findMin(nums));

        System.out.println(findMin(nums2));

        System.out.println(findMin(nums3));

        System.out.println(findMin(nums4));

        System.out.println(findMin(nums5));
    }


    public static int findMin(int[] nums) {

        int low=0;
        int high=nums.length-1;
        int min = Integer.MAX_VALUE;

        while(low<=high){

            int mid=low + ((high-low)/2);

            if (nums[low] <= nums[mid]){
                min=Math.min(nums[low],min);
                low=mid+1;
            }else{
                min=Math.min(nums[mid],min);
                high=mid-1;
            }

        }
        return min;
    }
}