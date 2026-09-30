import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionArray {

    public static void main(String[] args) {
        int[] nums1={3, 4, 6, 7, 9, 9};
        int[] nums2={1, 5, 7, 8, 8};
        System.out.println(Arrays.toString(UnionOfArrays(nums1,nums2)));
    }


    public static int[] UnionOfArrays(int[] nums1 , int [] nums2){
        Set<Integer> set = new HashSet<>();

        int i =0;
        int j =0;

        while (i< nums1.length && j < nums2.length){
            if (nums1[i]<=nums2[j]){
                set.add(nums1[i]);
                i++;
            }
            else{
                set.add(nums2[j]);
                j++;
            }
        }

        while (i< nums1.length){
            set.add(nums1[i]);
            i++;
        }

        while (j< nums2.length){
            set.add(nums2[j]);
            j++;
        }

        int [] ans = new int[set.size()];
        int k=0;
        for(Integer x : set){
            ans[k++]=x;
        }
        return ans;
    }
}
