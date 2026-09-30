class Solution {
    public int floorSqrt(int n) {

        int low=1;
        int high=n;

        while(low<=high){
            int mid=low+((high-low)/2);

            long val = (long) mid*mid;

            if (val<= (long) n){
                low=mid+1;
            }else {
                high=mid-1;
            }
        }
        return high;


    }
}