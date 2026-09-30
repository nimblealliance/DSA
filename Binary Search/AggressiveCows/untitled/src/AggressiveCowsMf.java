import java.util.Arrays;

public class AggressiveCowsMf {

    public static void main(String[] args) {

        int[] nums = {0, 3, 4, 7, 10, 9};

        int k=4;

        System.out.println(aggressiveCows(nums,k));
    }

    public static int aggressiveCows(int[] nums, int k) {
        Arrays.sort(nums);

        int low = 1 ; //min distance when cows are place adjacent
        int high = nums[nums.length-1]-nums[0]; // max distance when cows are placed at ends

        while(low <=high){

            int mid = low +((high-low)/2);

            if (isPossibleToPlace(nums, k , mid)){
                low=mid+1;
            } else {
                high=mid-1;
            }
        }
        return high;
    }

    public static boolean isPossibleToPlace(int[] nums , int cows , int distance){
        int cowsPlaced=1; // place one cow
        int lastPlaced=nums[0];

        //0,3,4,7,9,10  // start from 1 since you have already placed one cow at the start
        for (int i = 1; i < nums.length; i++) {

            if (nums[i]-lastPlaced >=distance){
                cowsPlaced++;
                lastPlaced=nums[i];
            }

            if (cowsPlaced>=cows){
                return true;
            }
        }
        return false;
    }


}
