class Solution2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int left=m-1;   //end of first array before any zeros
        int right=n-1;  //end of second array
        int correctPos=m+n-1;  //end of first array where zeros exist and where we need to put nums2

        while(right>=0){ // while we still have nums in second array , once this while loop ends we can be sure the remaning elements in the first array are already in the correct place since both the arrays are sorted

            // {1,2,3,0,0,0} and {5,6,8}
            // we start from the back and put all nums2 in nums1 it will be {1,2,3,5,6,8} , here the first element in nums2 is
            //greater than the last element in nums1 . hence iterating through nums2 is enough as nums1 elements are already sorted


            if (left>=0 && nums1[left]>nums2[right]){ // we have left >=0 check here to see if we still have elements in the nums1
                //to be checked , if not the else block will fill the rest with nums2 elements
                nums1[correctPos]=nums1[left];
                left--;

            }else {
                nums1[correctPos]=nums2[right];
                right--;
            }
            correctPos--;
        }
    }
}