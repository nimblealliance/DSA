import java.util.HashMap;

public class SubarraySumK {

    public static void main(String[] args) {

        int[] nums = {1,2,3};
        int k =3;

        System.out.println(subArray(nums,k));

    }


    public static int subArray(int[] nums, int k){
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        hashMap.put(0,1);
        int sum=0;
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];

            if (hashMap.containsKey(sum-k)){
                count+=hashMap.get(sum-k);
            }
            System.out.println("When i="+ nums[i]+ ", prefix sum is "+sum+" and the count is "+ count);
            hashMap.put(sum, hashMap.getOrDefault(sum,0)+1);

        }
        System.out.println(hashMap);
        return count;
    }

}
