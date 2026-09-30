import java.util.Arrays;

public class FrequencyOfMostFrequentMf {
    public static void main(String[] args) {
        System.out.println(maxFrequency(new int[]{3,9,6} , 2));
    }


    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        long windowSum = 0;
        int maxLength = 0;

        for(int right = 0 ; right<nums.length ; right++){

            windowSum += nums[right];

            long cost = (long) nums[right] * (right - left +1) - windowSum;

            while(cost > k){
                windowSum -= nums[left];
                left++;

                cost = (long) nums[right] * (right - left +1) - windowSum;
            }

            if(cost <= k){
                maxLength = Math.max(maxLength , right - left +1);
            }
        }
        return maxLength;
    }
}
