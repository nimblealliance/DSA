import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeSort(new int[]{7,4,1,5,3})));
    }
    public static int[] mergeSort(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        mergeSortRecurse(nums , low , high);
        return nums;
    }

    public static void mergeSortRecurse(int[] nums , int low , int high){
        if (low >= high){
            return;
        }

        int mid = low + (high - low)/2;
        mergeSortRecurse(nums , low , mid);
        mergeSortRecurse(nums , mid+1 , high);
        merge(nums , low , mid , high);
    }

    public static void merge(int[] nums , int low , int mid , int high){
        List<Integer> list = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while(left <= mid && right <=high){
            if(nums[left]<=nums[right]){
                list.add(nums[left]);
                left++;
            }else {
                list.add(nums[right]);
                right++;
            }
        }

        while(left<= mid){
            list.add(nums[left]);
            left++;
        }

        while(right<=high){
            list.add(nums[right]);
            right++;
        }

        for(int i=low ; i<=high ; i++){
            nums[i]=list.get(i-low);
        }

    }


}
