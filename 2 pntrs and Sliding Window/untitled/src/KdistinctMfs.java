import java.util.HashMap;

public class KdistinctMfs {
    public static void main(String[] args) {
        System.out.println(atMost(new int[]{1,2,1,2,3}, 2));
        System.out.println(atMost(new int[]{1,2,1,2,3}, 1));
        System.out.println(atMost(new int[]{1,2,1,2,3}, 2) - atMost(new int[]{1,2,1,2,3}, 1));

    }



    public static int atMost(int[] nums , int k){

        int left = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        int count = 0;

        for(int right = 0 ; right<nums.length ; right++){
            map.put(nums[right] , map.getOrDefault(nums[right] , 0) + 1);

            while(map.size() > k){
                map.put(nums[left] , map.get(nums[left]) - 1);

                if(map.get(nums[left]) == 0){
                    map.remove(nums[left]);
                }
                left++;
            }

            if(map.size() <= k){
                count+= right - left + 1;
            }
        }
        return count;
    }

}
