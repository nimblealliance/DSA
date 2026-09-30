import java.util.ArrayList;

class Solution {
    public static void main(String[] args) {
        System.out.println(isArmstrong(8209));
    }


    public static boolean isArmstrong(int n) {

        int x = n;
        int pow = 0;
        int temp = 0;
        int temp2 = n;
        boolean ans = false;

        while (x > 0) {
            x = x / 10;
            pow++;
        }

        while (n > 0) {
            int digit=n%10;
            temp= (int) (temp+Math.pow(digit,pow));
            n=n/10;
        }
        ArrayList<Integer> ans2 = new ArrayList<>();
        Math.sqrt(n);
        return temp==temp2;
    }
}
