public class CheckArraySorted {

    public static void main(String[] args) {
        int[] nums ={1,2,3,69,4,5};
        System.out.println(isSorted(nums));
    }


    public static boolean isSorted(int[] nums){

        int count=0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i+1]<nums[i]){
                count++;
            }
        }

        if (nums[nums.length-1]>nums[0]){
            count++;
        }

        System.out.println(count);
        return count < 2;

    }
}
