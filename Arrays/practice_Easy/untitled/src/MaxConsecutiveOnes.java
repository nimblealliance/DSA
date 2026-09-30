public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums={1,0,1,1,0,1};
        System.out.println(maxOnes(nums));
    }


    public static int maxOnes(int[] nums){

        int count=0;
        int maxCount=0;

        for (int i = 0; i < nums.length; i++) {

            if(nums[i]==1){
                count++;
                maxCount=Math.max(count,maxCount);
            } else {
                count=0;
            }
        }
        return maxCount;
    }






}
