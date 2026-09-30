import java.util.Arrays;

public class Solution {


    public static void main(String[] args) {
        int [] nums ={3,1,-2,-5,2,-4};
//        System.out.println(Arrays.toString(rearrangeArray2(nums)));
        System.out.println(Arrays.toString(rearrangeArray(nums)));

    }

    public static int[] rearrangeArray(int[] nums) {

        int[] ans = new int[nums.length];

        int pos=0;
        int neg=1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i]>0){
                ans[pos]=nums[i];
                pos+=2;
            } else{
                ans[neg]=nums[i];
                neg+=2;
            }
        }
        return ans;
    }


    public static int[] rearrangeArray2(int[] nums) {

        int[] pos = new int[nums.length/2];
        int[] neg = new int[nums.length/2];

        int j=0;
        int k=0;
        for(int i=0; i < nums.length ; i++){

            if (nums[i]<0){
                neg[j++]=nums[i];
            }else {
                pos[k++]=nums[i];
            }
        }

        int index=0;
        int l=0;
        int m=0;
        while( l < pos.length && m < neg.length){

            nums[index++]=pos[l];
            nums[index++]=neg[m];
            l++;
            m++;
        }

        return nums;
    }


}
