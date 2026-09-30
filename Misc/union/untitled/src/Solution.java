import java.util.ArrayList;
import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(unionArray(new int[]{3, 4, 6, 7, 9, 9},new int[]{1, 5, 7, 8, 8})));
        System.out.println(Arrays.toString(intersectionArray(new int[]{3, 4, 6, 7, 9, 9},new int[]{1, 5, 7, 8, 8})));

    }

    public static int[] intersectionArray(int[] nums1, int[] nums2){
        ArrayList<Integer> temp = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] < nums2[j]){
                i++;
            } else if (nums2[j]<nums1[i]) {
                j++;
            }else {
                temp.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] ansArray = new int[temp.size()];
        for (int k = 0; k < temp.size(); k++) {
            ansArray[k] = temp.get(k);
        }

        return ansArray;

    }

    public static int[] unionArray(int[] nums1, int[] nums2) {

        int i = 0;
        int j = 0;

        ArrayList<Integer> temp = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] <= nums2[j]) {

                if (temp.isEmpty() || temp.getLast() != nums1[i]){
                    temp.add(nums1[i]);
                }
                i++;
            }  else {
                if (temp.isEmpty() || temp.getLast() != nums2[j]){
                    temp.add(nums2[j]);
                }
                j++;
            }
        }

        while (i < nums1.length) {
            if (temp.getLast() != nums1[i]) {
                temp.add(nums1[i]);
            }
            i++;
        }

        while (j < nums2.length) {
            if (temp.getLast() != nums2[j]) {
                temp.add(nums2[j]);
            }
            j++;
        }

        int[] ansArray = new int[temp.size()];
        for (int k = 0; k < temp.size(); k++) {
            ansArray[k] = temp.get(k);
        }

        return ansArray;
    }
}
