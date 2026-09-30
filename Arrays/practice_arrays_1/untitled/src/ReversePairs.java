import java.util.ArrayList;
import java.util.Arrays;

public class ReversePairs {


    public static void main(String[] args) {
        int[] nums= {40,25,19,12,9,6,2};
        System.out.println(reversePairs(nums));
        System.out.println(Arrays.toString(nums));
    }


    public static int reversePairs(int[] nums){

         return mergeSort(nums , 0 , nums.length-1);

    }

    public static int mergeSort(int[] nums , int low , int high){

        int pairs=0;
        if (low>=high){
            return pairs;
        }

        int mid = (low + high)/2;

        pairs+=mergeSort(nums, low , mid);
        pairs+=mergeSort(nums, mid+1, high);
        pairs+=countInversions(nums , low , mid , high);
        merge(nums,low , mid , high);

        return pairs;
    }


    public static void merge(int[] nums , int low , int mid , int high){


        int left=low;
        int right=mid+1;
        ArrayList<Integer> temp = new ArrayList<>();

        while(left<=mid && right<=high){

            if (nums[left] <= nums[right]){
                temp.add(nums[left]);
                left++;
            }else {
                temp.add(nums[right]);
                right++;
            }
        }

        while(left<=mid){
            temp.add(nums[left]);
            left++;
        }

        while(right<=high){
            temp.add(nums[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            nums[i]=temp.get(i-low);
        }

    }


    public static int countInversions(int[] nums , int low , int mid , int high){

        int right=mid+1;

        int count=0;
        for (int i = low; i <=mid ; i++) {
            while(right<=high && (long) nums[i] > (long)2*nums[right]) right++;
            count=count+(right - (mid+1));

        }
        return count;
    }

}
