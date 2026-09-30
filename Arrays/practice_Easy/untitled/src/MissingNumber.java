import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {

        int[] nums ={9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber2(nums));
    }

    public static int missingNumber(int[] nums) {


        int xor1 = 0;
        int xor2 = 0;

        for (int i = 0; i<= nums.length ;i++ ){
            xor1^=i;
        }

        for (int num : nums) {
            xor2 ^= num;
        }

        return xor1^xor2;
    }

    public static int missingNumber2(int[] nums){

        int n = nums.length;
        Arrays.sort(nums);

        for(int i =0 ; i<n ; i++) {

            if (nums[i]!=i){
                return i;
            }
        }

        return n;

    }



}