public class practice1 {

    public static void main(String[] args) {
        int[] nums = {44,2,354,21,11,3};
        System.out.println(findMaxRecurse(nums,nums.length));
    }

    public static int findMaxRecurse(int[] nums , int n){

        if (n == 1){
            return nums[0];
        }

        int last = nums[n-1];
        int ans = findMaxRecurse(nums , n-1);
        return Math.max(last,ans);
    }
}
