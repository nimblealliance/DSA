public class FindInMountainArray {

    public static void main(String[] args) {

    }


    public static int findInMountainArray(int target, int[] nums){

        int peakIndex=findPeak(nums);
        int ansIndex=findIndex(nums,peakIndex,target,true);

        if (ansIndex==-1){
            ansIndex=findIndex(nums,peakIndex,target,false);
        }

        return ansIndex;


    }

    public static int findPeak(int[] nums){

        int low=0;
        int high= nums.length-1;

        while(low < high){

            int mid = low+((high-low)/2);

            if (nums[mid]>nums[mid+1]){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }

    public static int findIndex(int[] nums , int peakIndex , int target, boolean order){

        int ans=-1;

        if (order){

            int low=0;
            int high=peakIndex;

            while(low<=high){
                int mid = low+((high-low)/2);

                if (nums[mid]==target){
                   ans=mid;

                } else if (nums[mid]>target) {
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
        }

        else {

            int low=peakIndex;
            int high= nums.length-1;

            while(low<=high){
                int mid = low+((high-low)/2);

                if (nums[mid]==target){
                    ans=mid;

                } else if (nums[mid]>target) {
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
        }

        return ans;
    }

}
