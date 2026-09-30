import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

class Solution {

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        int[] intersection = intersection(nums1, nums2);
        System.out.println(Arrays.toString(intersection));

    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new LinkedHashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int m = nums1.length;
        int n = nums2.length;

        int i = 0;
        int j=0;

        while (i<m && j<n){

            if (nums1[i]==nums2[j]){
                set.add(nums1[i]);
                i++;
                j++;
            }else if (nums1[i] < nums2[j]){
                i++;
            } else {
                j++;
            }

        }

        int[] intersection = new int[set.size()];
        int k=0;
        for (Integer it : set){
            intersection[k]=it;
            k++;
        }
        return intersection;
    }

}