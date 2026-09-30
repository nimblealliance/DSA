import java.util.HashMap;

public class SingleNumber {

    public static void main(String[] args) {
        int[] nums ={4,1,2,1,2};
        System.out.println(singleNumber2(nums));
    }

    public static int singleNumber(int[] nums){

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Integer x : map.keySet()){
            if(map.get(x)==1){
                return x;
            }
        }
        return -1;
    }



    //XOR , xor of 0^0 is 0 , 4^4 = 0 , 0^4 = 4

    public static int singleNumber2(int[] nums){

        int xor=0;
        for (int num : nums) {
            xor ^= num;
        }
        return xor;
    }
}
