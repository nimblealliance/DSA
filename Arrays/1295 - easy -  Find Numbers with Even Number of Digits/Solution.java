public class Solution {


    public static void main(String[] args) {
        int[] nums = {0};
        System.out.println(countDigits(nums));
    }

    static int countDigits(int[] arr){
        int countOfEvenDigits=0;
        for (int i = 0; i < arr.length; i++) {
            if (hasEvenDigits(arr[i])){
                countOfEvenDigits++;
            }
        }
        return countOfEvenDigits;
    }

    private static boolean hasEvenDigits(int num) {

        int count=0;
        while (num >0){
            num = num/10;
            count++;
        }
        return count % 2 == 0;
    }
}
