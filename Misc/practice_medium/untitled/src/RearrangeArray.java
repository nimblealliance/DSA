import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeArray {

    public static void main(String[] args) {

        int[] nums = {3,1,-2,-5,2,-4};
        rearrange(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static int[] rearrange2 (int[] nums){

        int[] ans = new int[nums.length];

        int pos=0;
        int neg=1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i]>0){
                ans[pos]=nums[i];
                pos+=2;
            }else{
                ans[neg]=nums[i];
                neg+=2;
            }
        }

        return ans;

    }


    public static int[] rearrange (int[] nums){

        ArrayList<Integer> pos = new ArrayList<>(nums.length/2);
        ArrayList<Integer> neg = new ArrayList<>(nums.length/2);

        for (int i = 0; i < nums.length; i++) {

            if (nums[i]>0){
                pos.add(nums[i]);
            }else{
                neg.add(nums[i]);
            }
        }

        int i =0;
        int j =0;
        int k =0;

        while( j < pos.size() && k < neg.size()){
            nums[i++]=pos.get(j);
            nums[i++]= neg.get(k);
            j++;
            k++;
        }

        return nums;
    }

}
