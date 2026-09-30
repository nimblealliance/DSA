
class Solution {

    public static void main(String[] args) {
        int i = searchInsert(new int[]{1, 3, 5, 6}, 7);
        System.out.println(i);
    }

    public static int searchInsert(int[] nums, int target) {

        int l = 0;
        int r= nums.length-1;
        int mid=0;

        while(l <=r){
            mid = l+(r-l)/2;
            if(nums[mid] == target){
                return mid;
            }

            if (target<nums[mid]){
                r=mid-1;
            }

            else if (target >nums[mid]){

                l=mid+1;
            }
        }
        return l;
    }
}