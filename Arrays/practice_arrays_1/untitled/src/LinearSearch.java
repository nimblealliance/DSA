public class LinearSearch {
    public static void main(String[] args) {

    }

    public static int linearSearch(int[] nums , int target){

        int ans=-1;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target){
                ans=i;
                break;
            }
        }

        return ans;

    }

}
