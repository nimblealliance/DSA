class Solution {

    public static void main(String[] args) {

        int[] nums ={-2,0,-1};
        System.out.println(maxProduct(nums));

        int[] nums2 = {2,3,-2,4};
        System.out.println(maxProduct(nums2));

    }


    public static int maxProduct(int[] nums) {

        int currMax=1;
        int currMin=1;
        int maxProd=nums[0];


        for (int i = 0; i < nums.length; i++) {

            int temp=Math.max(nums[i],Math.max(nums[i]*currMax,nums[i]*currMin)); // we store the newly computed max in a temp since we need to use the previous max in the next step
            // if we change the max in this step , then the calculation of min in the next step will be wrong , so we set curMax = temp after we calculate currMin
            currMin=Math.min(nums[i],Math.min(nums[i]*currMax,nums[i]*currMin)); // we get the min because smaller negative values when multiplied with a negative value
            //gets a larger value , e.g. if nums[i] is -2 , then -3*-2 > -2*-2 , so that's why we store the minimum
            currMax=temp;

            //get the overall max
            maxProd=Math.max(maxProd,currMax);

        }

        return maxProd;

    }
}