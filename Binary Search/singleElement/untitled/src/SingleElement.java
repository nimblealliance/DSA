public class SingleElement {


    public static void main(String[] args) {

        // Checkout the second method , that code is more intuitive
    }


    public static int singleNonDuplicate(int[] nums){
        int n = nums.length;
        int singleNumber = -1;
        if (n == 1) return nums[0];

        if (nums[0] != nums[1]) return nums[0];

        if (nums[n - 1] != nums[n - 2]) return nums[n - 1];

        int low = 1;
        int high = n - 2;

        while (low <= high) {

            // so what is a property of a pair? if the array contains numbers with pairs, each number pair will occupy index such as (even , odd) , where
            //the first element of the said pair is at even index and the second element of the same pair is at odd index.

            //If there is a single element in the array , the above condition will break at some point , because of it adding one index extra , the pairs
            //after the single number will occupy index such as (odd , even) ,  where the first element of the said pair is at odd index and the second
            // element of the same pair is at odd index. This phenomenon is caused due to the single number ,and we can use it to eliminate half of the array
            // while doing BS

            // How do we take a call? Well , the numbers on left side of the single element will be at (even,odd) pairs and the numbers on the right will be
            // at (odd,even) pairs , so we do our checks according to that.

            int mid = low + ((high - low) / 2);

            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                singleNumber = nums[mid];
            }

            if (mid % 2 == 0 && nums[mid] == nums[mid + 1] || mid % 2 == 1 && nums[mid] == nums[mid - 1]) {
                // the above condition is to check if we are on the left side of the single number , i.e. if the index is even and the number after it is same
                // or the index is odd and the number before is same , we are checking the (even , odd) contract , if either of those are true , we have perfect
                //pairs up until our mid , so single number can't exist before mid , so we trim the search space and bring low=mid+1;

                low = mid + 1;

            } else {
                // if the huge ass condition in the if block is not true , we are on the right side of single element , so trim the right side

                high = mid - 1;
            }
        }
        return singleNumber;

    }


    public int singleNonDuplicate2(int[] nums) {

        int n = nums.length;
        int ans = -1;

        if (n == 1) {
            return nums[0];
        }

        if (nums[0] != nums[1]) {
            return nums[0];
        }

        if (nums[n - 1] != nums[n - 2]) {
            return nums[n - 1];
        }

        int low = 1;
        int high = nums.length - 2;

        while (low <= high) {
            int mid = low + ((high - low) / 2);

            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                ans = nums[mid];
                break;
            }

            if (mid % 2 == 0) {
                if (nums[mid] != nums[mid + 1]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            if (mid % 2 == 1) {

                if (nums[mid] != nums[mid - 1]) {
                    high = mid - 1;
                }

                else {
                    low = mid + 1;
                }
            }
        }
        return ans;

    }

}
