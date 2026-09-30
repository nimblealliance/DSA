import java.util.ArrayList;

public class CountInversions2 {


    public static void main(String[] args) {

        int[] nums = {1,3,2,3,1};
        System.out.println(numberOfInversions(nums));

    }


    public static int numberOfInversions(int[] nums) {

        int countInv=0;

        if (nums.length==0){
            return 0;
        }
        countInv=mergeSort(nums,0,nums.length-1);
        return countInv;
    }

    public static int mergeSort(int[] nums , int low , int high){

        int countInversions=0;
        if (low >= high){
            return countInversions;
        }

        int mid = (low+high)/2;
        int leftInversions=mergeSort(nums, low , mid);
        int rightInversions=mergeSort(nums, mid+1, high);
        int inversions=merge(nums , low , mid , high);

        countInversions=leftInversions+rightInversions+inversions;
        return countInversions;
    }


    public static int merge(int[] nums , int low , int mid , int high){

        int left=low;
        int right=mid+1;
        ArrayList<Integer> temp = new ArrayList<>();
        int inversions=0;
        while(left<=mid && right<=high){

            if (nums[left]<=nums[right]){
                temp.add(nums[left]);
                left++;
            }else{
                temp.add(nums[right]);
                if(nums[left]>2*nums[right]){
                    inversions+=(mid-left+1);
                }
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
        for(int i=low ; i<= high ; i++){
            nums[i]=temp.get(i-low);
        }

        return inversions;

    }

}
