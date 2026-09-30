import java.util.HashMap;

class Solution {

    public static void main(String[] args) {

        int[] nums = {3,-3,1,1,1};
        int i = subarraySum(nums, 3);
        System.out.println(i);

    }



    public static int subarraySum(int[] nums, int k) {
        int count=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0;
        map.put(0,1);

        for (int i =0 ; i < nums.length ; i++){
            sum=sum+nums[i];

            //we check if the hashmap has any prefix sum which is sum-k
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);

        }
        System.out.println(map);
        return count;
    }
}

//sum count
//0 1
//1 1
//3 1
//6 1
