import java.util.Arrays;
import java.util.HashSet;

public class UnionOfTwoSortedArrays {

    public static void main(String[] args) {
        int[] nums1={1, 2, 3, 4, 5};
        int[] nums2={1, 2, 7};
        System.out.println(Arrays.toString(UnionOfArrays(nums1,nums2)));
    }

    public static int[] UnionOfArrays(int[] nums1 , int [] nums2){

        HashSet<Integer> set = new HashSet<>();

        int i=0;
        int j=0;
        int m=nums1.length;
        int n= nums2.length;

        while (i<m && j <n){
            if (nums1[i]<=nums2[j]){
                set.add(nums1[i]);
                i++;
            }else{
                set.add(nums2[j]);
                j++;
            }
        }

        while(i<m){
            set.add(nums1[i]);
            i++;
        }

        while(j<n){
            set.add(nums2[j]);
            j++;
        }

        int[] ans = new int[set.size()];
        int k=0;

        for(Integer x : set){
            ans[k++]=x;
        }

        return ans;


    }

}
