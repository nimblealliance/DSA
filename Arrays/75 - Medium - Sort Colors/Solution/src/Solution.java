class Solution {

    public static void main(String[] args) {

        int[] nums = {2};
        sortColors(nums);

    }

    //DNF algorithm , checkout https://www.youtube.com/watch?v=tp8JIuCXBaU&ab_channel=takeUforward
    public static void sortColors(int[] nums) {

        int low=0;
        int mid=0;
        int high=nums.length-1;

        while(mid<=high){
            if (nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,mid,high);
                high--;
            }
        }
    }

    public static void swap(int[] nums, int i,int j){
        int temp=nums[j];
        nums[j]=nums[i];
        nums[i]=temp;
    }


//    public static void sortColors(int[] nums) {
//        //{2,0,2,1,1,0}
//        HashMap<Integer,Integer> map = new HashMap<>();
//
//        //count the occurrences
//
//        map.put(0,0);
//        map.put(1,0);
//        map.put(2,0);
//
//        for (int i = 0 ; i < nums.length ; i++){
//            map.put(nums[i] , map.getOrDefault(nums[i],0)+1);
//        }
//
//        System.out.println(map);
//
//
//        for (int j = 0; j < map.get(0); j++) {
//            nums[j] = 0;
//        }
//
//        for (int k = map.get(1); k < map.get(1)+map.get(2); k++) {
//            nums[k] = 1;
//        }
//
//        for (int l =  map.get(1)+map.get(2); l < nums.length; l++) {
//            nums[l]=2;
//        }
//
//        System.out.println(Arrays.toString(nums));
//    }


}