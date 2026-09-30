class Solution {

    public static void main(String[] args) {
        int [] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int consecutive=0;
        int max=0;
        for (int num : nums) {
            if (num == 1) {
                consecutive++;
                max = Math.max(consecutive, max);
            } else {
                consecutive = 0;
            }
        }
        return max;
    }
}