public class LargestElement {

    public static void main(String[] args) {
        int[] nums = {3, 3, 0, 99, -40};
        System.out.println(largestElement(nums));
    }

    public static int largestElement(int[] nums){

        int largest=nums[0];

        for (int i = 1; i < nums.length; i++) {
            largest=Math.max(largest,nums[i]);

        }

        return largest;

    }



}
