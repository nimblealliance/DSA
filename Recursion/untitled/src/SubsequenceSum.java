import java.util.ArrayList;
import java.util.List;

public class SubsequenceSum {

    public static void main(String[] args) {
        int[] nums =  {4, 9, 2, 5, 1} ; int k = 10;
        System.out.println(countSubsequenceWithTargetSum(nums,k));
    }

    public static int countSubsequenceWithTargetSum(int[] nums, int k) {

        int count = 0;
        int sum=0;
        List<Integer> subsequence = new ArrayList<>();
        count=getSubsequenceCount(nums , k ,0 , sum);
        return count;
    }

    public static int getSubsequenceCount(int[] nums , int k , int ind ,int sum){

        if(sum == k){
            return 1;
        }

        if (ind == nums.length || sum > k) {
            return 0;
        }

        sum +=nums[ind];
        int include=getSubsequenceCount(nums , k , ind+1, sum);
        sum-=nums[ind];

        int exclude=getSubsequenceCount(nums , k , ind+1, sum);

        return include+exclude;
    }
}
