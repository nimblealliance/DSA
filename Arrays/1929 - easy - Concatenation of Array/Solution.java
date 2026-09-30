import java.util.Arrays;

public class Solution {


    public static void main(String[] args) {

        int[] concatenation = getConcatenation(new int[]{1, 3, 2, 1});
        System.out.println(Arrays.toString(concatenation));

    }

    public static int[] getConcatenation(int[] nums) {
        int[] newArr = new int[nums.length*2];
        int index=0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < nums.length; j++) {
                newArr[index]=nums[j];
                index++;
            }
        }
        return newArr;
    }









}
