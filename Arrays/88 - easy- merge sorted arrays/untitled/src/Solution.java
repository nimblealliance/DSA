import java.util.Arrays;

public class Solution {


    public static void main(String[] args) {

        int[] nums1={1,2,3,4,0,0,0};
        int[] nums2={2,5,6};
        merge(nums1,4,nums2,3);
        System.out.println(Arrays.toString(nums1));

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int left=m-1;   //end of first array before any zeros
        int right=n-1;  //end of second array
        int correctPos=m+n-1;  //end of first array where zeros exist and where we need to put nums2

        while(right>=0 && left >=0){

            if (nums1[left]>nums2[right]){
                nums1[correctPos]=nums1[left];
                left--;

            }else {
                nums1[correctPos]=nums2[right];
                right--;
            }
            correctPos--;
        }


        while(right>=0){
            nums1[correctPos--]=nums2[right--];

        }
    }

}
