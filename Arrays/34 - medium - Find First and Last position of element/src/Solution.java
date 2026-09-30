class Solution {
    public int[] searchRange(int[] nums, int target) {


        int[] ans=new int[2];
        ans[0]=findFirst(nums,target);
        ans[1]=findLast(nums,target);

        //return index of [first , last] if the value matches or just return [-1,-1]
        return ans;
    }
    //find last occurrence
    public static int findLast(int[] nums , int target){
        int left =0;
        int right=nums.length-1;
        int result=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if (nums[mid]==target){ 
                result=mid;
                left=mid+1;
            }else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return result;

    }

    //find first occurrence
    public static int findFirst(int[] nums , int target){
        int left =0;
        int right=nums.length-1;
        int result=-1;

        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                result=mid;
                right=mid-1;
            }else if(nums[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return result;
    }
}