import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Solution {


    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        int n = 10, m = 7;
        ArrayList<Integer> union = union2(arr1, arr2);
        System.out.println(union);
        Set<Integer> set = new LinkedHashSet<>();

    }

    //using set
    static ArrayList<Integer> union(int[] nums1 , int[] nums2){

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            set.add(nums2[i]);
        }

        ArrayList<Integer> union = new ArrayList<>();
        for (Integer it : set){
            union.add(it);
        }
        return union;

    }

    //without using set

    static ArrayList<Integer> union2 (int[] nums1 , int[] nums2){
        ArrayList<Integer> union = new ArrayList<>();

        int n = nums1.length;
        int m = nums2.length;

        int i=0;
        int j=0;

        while (i<n && j<m){
            if(nums1[i]<=nums2[j]){
                if (union.size()==0 || union.get(union.size()-1) !=nums1[i]){
                    union.add(nums1[i]);
                }
                i++;
            }
            else {
                if (union.size()==0 || union.get(union.size()-1) !=nums2[j]){
                    union.add(nums2[j]);
                }
                j++;
            }
        }


        while(j<m){
            if (union.size()==0 || union.get(union.size()-1) !=nums2[j]){
                union.add(nums2[j]);
            }
            j++;
        }

        while(i<n){
            if (union.size()==0 || union.get(union.size()-1) !=nums1[i]){
                union.add(nums1[i]);
            }
            i++;
        }

        return union;
    }
}
