public class CheckSorted {

    public static void main(String[] args) {
        int[] nums= {3,4,5,1,2};
        int[] nums2= {2,1,3,4};

        System.out.println(check(nums));
        System.out.println(check(nums2));
    }

    public static boolean check(int[] nums){

        int count=0;
        int n= nums.length;
        for (int i = 0; i < n-1; i++) {

            if (nums[i]>nums[i+1]){
                count++;
            }

        }

        if (nums[n-1]>nums[0]){
            count++;
        }

        return count <=1;



    }

}
