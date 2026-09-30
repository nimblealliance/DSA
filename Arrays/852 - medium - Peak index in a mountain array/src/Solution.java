class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left =0;
        int right=arr.length-1;
        int ans=0;

        while(left<=right){
            int mid=left+(right-left)/2;

            if (arr[mid]<arr[mid+1]){
                left=mid+1;
            }
            else if(arr[mid]>arr[mid+1]){
                ans=mid;
                right=mid-1;
            }
            else{
                ans=mid;
            }

        }
        return ans;
    }
}