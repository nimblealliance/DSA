public class Solution {

    public static void main(String[] args) {

    }

    static int searchingAns(int[] nums , int target){
        int start =0;
        int end = 1;
        int result=-1;


        while(target > nums[end]){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start = temp;

        }
        return binarySearch(nums,start,end,target);

    }

    static int binarySearch(int[] nums , int start , int end , int target){

        int mid=0;
        while(start <=end){
            mid=end+(end-start)/2;
            if (target < nums[mid]){
                end=mid-1;
            }
            else if(target > nums[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
