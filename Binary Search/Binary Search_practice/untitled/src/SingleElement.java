public class SingleElement {

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        int [] nums2= {3,3,7,7,10,11,11};

        System.out.println(singleNum(nums));
        System.out.println(singleNum(nums2));
    }


    public static int singleNum(int[] nums){

        int n=nums.length;
        int ans=-1;

        if (n==1){
            return nums[0];
        }

        if (nums[0]!=nums[1]){
            return nums[0];
        }

        if (nums[n-1]!=nums[n-2]){
            return nums[n-1];
        }

        int low=1;
        int high=nums.length-2;

        while (low<=high){
            int mid=low+((high-low)/2);

            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
                ans=nums[mid];
                break;
            }

            if (mid %2==0){
                if(nums[mid] != nums[mid+1]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            if (mid%2==1){

                if(nums[mid] != nums[mid-1]){
                    high=mid-1;
                }

                else{
                    low=mid+1;
                }
            }
        }
        return ans;
    }
}
