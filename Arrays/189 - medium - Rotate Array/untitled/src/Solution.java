import java.util.ArrayList;
import java.util.Arrays;

public class Solution {


    public static void main(String[] args) {

        int[] nums={1,2,3,4,5};
        int K=2;
//        rotateLeftByKPlaces(nums,K);
//        System.out.println(Arrays.toString(nums));
        rotateRightByKPlaces(nums,K);
        System.out.println(Arrays.toString(nums));

//        rotateLeftByOnePlace(nums);
//        System.out.println(Arrays.toString(nums));
    }




    static void rotateLeftByKPlaces(int[] nums, int k) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        //k=2;
        for (int i = 0; i < k; i++) {
            arrayList.add(nums[i]);
        }

        //{1,2,3,4,5}
        for (int i = k ; i< nums.length; i++){
            nums[i-k]=nums[i];
        }

        //{3,4,5,4,5} ; k = 2; nums.length=5 ;
        for (int i = nums.length-k , j=0; i < nums.length ; i++, j++) {
            nums[i]= arrayList.get(j);
        }

    }


    static void rotateRightByKPlaces(int[] nums, int k) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        int n = nums.length;
        k=k%n;
        //k=2; n=5 ; {1,2,3,4,5}
        //            0 1 2 3 4
        for (int i = n-k; i < n; i++) {
            arrayList.add(nums[i]);

        }

        //{1,2,3,4,5}
        for (int i = 0 ; i< n-k; i++){
            arrayList.add(nums[i]);
        }

        for (int i = 0; i < n; i++) {
            nums[i]=arrayList.get(i);
        }

    }


    static void rotateLeftByOnePlace(int[] nums){

        int temp=nums[0];
        for(int i = 1; i< nums.length ; i++){
            nums[i-1]=nums[i];
        }
        nums[nums.length-1]=temp;
    }
}
