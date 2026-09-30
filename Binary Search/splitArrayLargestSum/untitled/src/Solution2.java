public class Solution2 {

    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;
        System.out.println(splitArray(nums,k));
    }


    public static int splitArray(int[] nums, int k) {

        int low=Integer.MAX_VALUE;
        int high=0;


        for (Integer x : nums){
            low=Math.min(low,x);
            high+=x;
        }

        while(low<=high){

            int mid = low + ((high - low)/2);

            if(canSplit(nums , k , mid)){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return low;
    }

    public static boolean canSplit(int[] nums , int splitsRequired , int currSplitTotal){

        int splits=1;
        int splitTotal=0;

        for (int i = 0; i < nums.length ; i++) {

            if (splitTotal+nums[i]>currSplitTotal){
                splits++;
                splitTotal=nums[i];

                if (splits > splitsRequired){
                    return false;
                }

            }else {
                splitTotal+=nums[i];
            }
        }
        return true;
    }
}
