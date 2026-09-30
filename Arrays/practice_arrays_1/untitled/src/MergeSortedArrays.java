import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int m = 3;
        int[] nums2={4,5,6};
        int n= 3;
        System.out.println(Arrays.toString(merged(nums1, m, nums2, n)));

    }

    public static int[] merged(int[] nums1 , int m , int[] nums2 , int n){

        int i=m-1;
        int j =n-1;
        int correctPos= nums1.length-1;

        while (i>=0 && j >=0){

            if (nums1[i]>=nums2[j]){
                nums1[correctPos]=nums1[i];
                i--;
            }else {
                nums1[correctPos]=nums2[j];
                j--;
            }correctPos--;
        }

        while(j>=0){
            nums1[correctPos]=nums2[j];
            correctPos--;
            j--;
        }
        return nums1;
    }
}
