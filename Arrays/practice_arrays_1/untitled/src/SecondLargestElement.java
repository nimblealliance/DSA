public class SecondLargestElement {

    public static void main(String[] args) {

        int[] nums = {7, 7, 2, 2, 10, 10, 10};
        System.out.println(secondLargest(nums));

    }

    public static int secondLargest(int[] nums){

        int largest=nums[0];
        int secondLargest=-1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i]>largest){
                secondLargest=largest;
                largest=nums[i];

            } else if (nums[i]>secondLargest && nums[i]<largest) {
                secondLargest=nums[i];
            }

        }

        return secondLargest;

    }



}
