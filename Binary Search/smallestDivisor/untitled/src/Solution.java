class Solution {
    public int smallestDivisor(int[] nums, int threshold) {

        int max_val=Integer.MIN_VALUE;
        for(Integer x : nums){
            if (x>max_val){
                max_val=x;
            }
        }

        int low=1;
        int high=max_val;

        while(low<=high){
            int mid=low + ((high-low)/2);

            if (calculateSum(nums,mid)<= threshold){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return low;

    }

    public int calculateSum(int[] nums , int divisor){
        int sum=0;

        for(Integer x : nums){
            sum+=( x+ divisor - 1)/divisor;
        }
        return sum;
    }


}