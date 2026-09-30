class Solution{

    public static void main(String[] args) {
        int[] nums = {-1,4,-4,5,-2,-1,-1,-2,-3};
        System.out.println(maxProduct(nums));
    }


    public static int maxProduct(int[] nums){

        int currMin=1;
        int currMax=1;
        int maxProd=nums[0];

        for (int i = 0; i < nums.length; i++) {

            int temp=Math.max(nums[i],Math.max(nums[i]*currMax,nums[i]*currMin));
            currMin=Math.min(nums[i],Math.min(nums[i]*currMax,nums[i]*currMin));
            currMax=temp;


            maxProd=Math.max(maxProd,currMax);
        }

        return maxProd;

    }




}