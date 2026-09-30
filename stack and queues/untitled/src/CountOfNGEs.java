import java.util.*;

public class CountOfNGEs {
    public static void main(String[] args) {

        System.out.println(count_NGE(new int[]{1, 2, 3, 4, 1},new int[]{0,3}));

    }

    public static List<Integer> count_NGE(int[] arr, int[] indices) {

        List<Integer> ans = new ArrayList<>();

        for(Integer i : indices){
            int count = 0;

            for(int j=i+1 ; j< arr.length; j++){
                if (arr[j]>arr[i]) count++;
            }
            ans.add(count);
        }
        return ans;
    }

}
