import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortPractice {

    public static void main(String[] args) {

        int[] nums={3,2,8,5,1,4,23};
        mergeSort(nums,0, nums.length-1);
        System.out.println(Arrays.toString(nums));

    }

    public static void mergeSort(int[] nums , int low , int high){

        if (low>=high){
            return;
        }
        int mid = (low+high)/2;
        mergeSort(nums,low,mid);
        mergeSort(nums,mid+1,high);
        merge(nums , low , mid, high);
    }

    public static void merge(int[] nums , int low , int mid , int high){
        int left=low;
        int right=mid+1;
        ArrayList<Integer> temp = new ArrayList<>();

        while(left<=mid && right<=high){

            if (nums[left]<=nums[right]){
                temp.add(nums[left]);
                left++;
            }else{
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

        for (int i=low ; i<=high ; i++){
            nums[i]=temp.get(i-low);
        }
    }
}
