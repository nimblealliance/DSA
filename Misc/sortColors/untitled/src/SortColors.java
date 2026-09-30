import java.util.Arrays;
import java.util.HashMap;

public class SortColors {

    public static void main(String[] args) {

        int[] nums = {2,0,2,1,1,0};
        sortColors3(nums);
    }

    public static void sortColors3(int[] nums){

        int low=0;
        int mid=0;
        int high=nums.length-1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[mid]==0){
                swap(nums , low , mid);
                low++;
                mid++;

            } else if (nums[mid]==1) {
                mid++;
            }else{
                swap(nums, mid , high);
                high--;
            }
        }

        System.out.println(Arrays.toString(nums));

    }

    public static void swap(int[] nums , int start , int end){
            int temp=nums[end];
            nums[end]=nums[start];
            nums[start]=temp;
    }


    public static void sortColors2(int[] nums){

        int zeros=0;
        int ones=0;
        int twos=0;

        for (int i = 0; i < nums.length; i++) {

            if(nums[i]==0){
                zeros++;
            } else if (nums[i]==1) {
                ones++;
            }else{
                twos++;
            }
        }

        int count=0;

        for (int j = 0; j < zeros; j++) {
            nums[count++]=0;
        }

        for (int k = 0; k < ones; k++) {
            nums[count++]=1;
        }

        for (int l = 0; l < twos; l++) {
            nums[count++]=2;
        }

        System.out.println(Arrays.toString(nums));

    }

    public static void sortColors(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0,0);
        map.put(1,0);
        map.put(2,0);
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        System.out.println(map);

        int count=0;
        for (int j = 0; j < map.get(0); j++) {
            nums[count++]=0;
        }
        for (int k = 0; k < map.get(1); k++) {
            nums[count++]=1;
        }
        for (int l = 0; l < map.get(2); l++) {
            nums[count++]=2;
        }

        System.out.println(Arrays.toString(nums));

    }


}
