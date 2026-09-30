import java.util.Arrays;
import java.util.HashMap;


public class DNF {
    public static void main(String[] args) {
        int[] nums = {0,1,1,0,1,2,1,2,0,0,0};

//        sortColors(nums);
        sortColors2(nums);
        System.out.println(Arrays.toString(nums));



    }


    public static void sortColors2(int[] nums){
        int low = 0;
        int mid= 0;
        int high = nums.length-1;

        while(mid <= high){
            if (nums[mid]==0){
                swap(nums , low , mid);
                low++;
                mid++;

            } else if (nums[mid]==1) {
                mid++;
            }else {

                swap(nums, mid ,high);
                high--;
            }
        }
    }

    public static void swap(int[] nums , int i , int j ){
        int temp = nums[j];
        nums[j]=nums[i];
        nums[i]=temp;

    }

    public static void sortColors(int[] nums){

        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0,0);
        map.put(1,0);
        map.put(2,0);


        for(int i = 0 ; i < nums.length ; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        System.out.println(map);

        for(int i =0 ; i < map.get(0) ; i++){
            nums[i]=0;
        }

        for (int i =map.get(0) ; i < map.get(0)+map.get(1) ; i++){
            nums[i]=1;
        }

        for (int i =map.get(0)+map.get(1) ; i < nums.length ; i++){
            nums[i]=2;
        }
    }

}
