import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeSign {


    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }

    public static int[] rearrangeArray(int[] nums){

        ArrayList<Integer> pos = new ArrayList<>(nums.length/2);
        ArrayList<Integer> neg = new ArrayList<>(nums.length/2);
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0){
                pos.add(nums[i]);
            }else{
                neg.add(nums[i]);
            }
        }

        int i=0;
        int j=0;
        int k=0;

        while(j < pos.size() && k < neg.size()){
            ans[i++]=pos.get(j);
            ans[i++]=neg.get(k);
            j++;
            k++;
        }
        return ans;
    }
}
