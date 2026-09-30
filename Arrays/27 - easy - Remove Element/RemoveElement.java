import java.util.Arrays;

public class RemoveElement {


    public static void main(String[] args) {

        int[] nums = {0,1,2,2,3,0,4,2};
        int val=2;
//
//        int [] nums = {3,3};
//        int val = 3;
        int i = removeElement(nums, val);
        System.out.println(i);
        System.out.println(Arrays.toString(nums));
    }
    static int removeElement(int[] nums, int val) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            if (nums[l] == val) {
                nums[l] = nums[r]; // overwrite with last element
                r--;               // shrink valid array
                // don't move l yet; we need to check the new value at nums[l]
            } else {
                l++; // current element is fine, move on
            }
        }

        return r + 1; // new length after removing all val elements
    }
}
