class Solution {
    public static void main(String[] args) {

        int[] nums={2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {

        int count =0;
        int candidate=0;

        for(int i=0 ; i< nums.length ; i++){

            if (count==0){
                count++;
                candidate=nums[i];
            }
            else if(nums[i]== candidate){
                count++;
            }
            else {
                count--;
            }

        }

        int count2=0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j]==candidate){
                count2++;
            }

        }

        if (count2> nums.length/2){
            return candidate;
        }

        return -1;
    }

    // O(2n) TC , O(n) SC
    // public int majorityElement(int[] nums) {
    //     HashMap<Integer,Integer> map = new HashMap<>();

    //     for(int i =0 ; i< nums.length ; i++){
    //         map.put(nums[i], map.getOrDefault(nums[i],0)+1);
    //     }

    //     for(Map.Entry<Integer,Integer> entry : map.entrySet()){
    //     if (entry.getValue() > nums.length/2){
    //         return entry.getKey();
    //     }
    // }
    //     return 0;
    // }
}