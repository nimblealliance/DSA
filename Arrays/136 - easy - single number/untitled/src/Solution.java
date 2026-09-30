class Solution {

    public static void main(String[] args) {

        int[] nums ={2,2,1};
        System.out.println(singleNumber(nums));


    }

    public static int singleNumber(int[] nums) {

        int xor=0;

        for (int i = 0; i < nums.length; i++) {
            xor=xor^nums[i];
        }

        return xor;
    }

// BF
//    public static int singleNumber(int[] nums) {
//        int ans=1;
//        HashMap<Integer , Integer> map = new HashMap<>();
//
//        for (int i=0 ; i<nums.length;i++){
//            if (map.get(nums[i])==null){
//                map.put(nums[i],1);
//            }else{
//                map.put(nums[i],map.get(nums[i])+1);
//            }
//        }
//
//        for (Integer i : map.keySet()){
//            if(map.get(i)==1){
//                ans=i;
//            }
//        }
//
//        return ans;
//    }
}