class Solution {

    public static void main(String[] args) {
        System.out.println(reverseNum(1463847412));
    }

    public static int reverseNum(int x){

        int rev=0;
        boolean isNegative=false;

        if (x<0){
            isNegative=true;
            x=-x;
        }
        while (x>0){

            int digit=x%10;
            x=x/10;

            if (rev > (Integer.MAX_VALUE-digit)/10){
                return 0;
            }
            rev=(rev*10)+digit;

        }
        if (isNegative){
            return -rev;
        }
        return rev;
    }
}