import java.util.ArrayList;
import java.util.Arrays;

public class CountInversions {

    public static void main(String[] args) {
        int[] nums={2,3,7,1,3,5};
        int ans=countInversion(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(ans);
    }


    public static int countInversion(int[] nums){

        return mergeSort(nums,0, nums.length-1);

    }

    public static int mergeSort(int[] nums , int low , int high){

        int countOfInversions=0;
        if(low>=high){
            return countOfInversions;
        }

        int mid = (low+high)/2;
        countOfInversions+=mergeSort(nums,low,mid);
        countOfInversions+=mergeSort(nums,mid+1,high);
        countOfInversions+=merge(nums , low , mid , high);

        return countOfInversions;

    }

    public static int merge(int[] nums , int low , int mid , int high){

        int count=0;
        int left=low;
        int right=mid+1;

        ArrayList<Integer> temp = new ArrayList<>();

        while (left <= mid && right <= high){

            if (nums[left]<= nums[right]){
                temp.add(nums[left]);
                left++;

            }else {
                temp.add(nums[right]);
                count+=mid-left+1;
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
        return count;
    }
}
