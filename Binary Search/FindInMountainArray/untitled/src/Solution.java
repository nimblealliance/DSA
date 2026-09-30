public class Solution {


    public static void main(String[] args) {
        int [] nums = {3,5,3,2,0};
        System.out.println(findInMountainArray(0,nums));
    }

    public static int findInMountainArray(int target, int [] mountainArr) {

        int peakIndex = findPeak(mountainArr);
        int ans = binarySearch(mountainArr , target , peakIndex , true);

        if (ans == -1){
            ans=binarySearch(mountainArr , target , peakIndex , false);
        }

        return ans;
    }

    public static int findPeak(int [] mountainArr){

        int n = mountainArr.length;

        int low=0;
        int high=n-1;

        while(low<=high){

            int mid=(low + (high - low)/2);

            if (mountainArr[mid]>mountainArr[mid-1] && mountainArr[mid]>mountainArr[mid+1]){
                return mid;
            } else if (mountainArr[mid] > mountainArr[mid + 1]) {
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }

    public static int binarySearch (int[] mountainArr , int target , int peakIndex, boolean order){

        int targetIndex=-1;
        int n = mountainArr.length;

        if (order){
            int low=0;
            int high=peakIndex;

            while(low<=high){

                int mid=(low + (high - low)/2);

                if (mountainArr[mid]==target){
                    return mid;
                }else if (mountainArr[mid]<target){
                    low=mid+1;
                }else {
                    high=mid-1;
                }
            }

        } else {

            int low=peakIndex;
            int high=n-1;

            while(low<=high){

                int mid=(low + (high - low)/2);

                if (mountainArr[mid]==target){
                    return mid;
                }else if (mountainArr[mid]>target){
                    low=mid+1;
                }else {
                    high=mid-1;
                }

            }


        }
        return  targetIndex;
    }
}
