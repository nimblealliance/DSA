public class SearchInsert {

    public static void main(String[] args) {
        int [] nums ={1,3,5,6};
        int target=5;
        System.out.println(insertPos(nums,target));
    }

    public static int insertPos(int[] nums , int target){

        int ans= nums.length;

        int low=0;
        int high= nums.length-1;


        while (low<=high){

            int mid=low+((high-low)/2);


            if (nums[mid]==target){
                return mid;
            }else if (nums[mid]>target){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }

}
