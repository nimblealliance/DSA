public class CheckArraySortedMF {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,3};
        System.out.println(checkSorted(nums, 0));
    }

    public static boolean checkSorted(int[] nums , int ind){

        if(ind >= nums.length-1){
            return true;
        }

        if(nums[ind]>nums[ind+1]){
            return false;
        }
        return checkSorted(nums , ind+1);
    }
}
