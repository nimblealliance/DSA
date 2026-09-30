import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        int[] nums={3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }

    public static int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length/2];
        int[] neg = new int[nums.length/2];
        int posIndx=0;
        int negIndx=0;

        for (int i=0 ; i<nums.length; i++){

            if (nums[i]>0){
                pos[posIndx++]=nums[i];
            }

            else if (nums[i]<0){
                neg[negIndx++]=nums[i];
            }
        }

        int iIndx=0;
        int j=0;
        int k=0;
        while( j < pos.length && k < neg.length){
            nums[iIndx++]=pos[j++];
            nums[iIndx++]=neg[k++];
        }
        return nums;
    }
}