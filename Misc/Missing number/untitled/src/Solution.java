import java.util.Arrays;

class Solution {

    public static void main(String[] args) {

        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(nums.length);
        System.out.println(missingNumber(nums));
        System.out.println(missingNumber2(nums));
    }

    public static int missingNumber(int[] nums) {
        int ans=0;
        Arrays.sort(nums);

        for (int i=0 ; i < nums.length ; i++){
            if (nums[i]!=i){
                return i;
            }
        }
        return nums.length;
    }

    public static int missingNumber2(int[] nums){
        int xor1=0;
        int xor2=0;

        int n = nums.length;

        for (int i=0 ; i<=n ; i++){
            xor1=xor1^i;
        }

        for (int num : nums) {
            xor2 = xor2 ^ num;
        }

        return xor1^xor2;
    }

}