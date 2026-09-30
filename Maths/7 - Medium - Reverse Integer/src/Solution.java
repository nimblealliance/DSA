class Solution {
    public int reverse(int x) {

        boolean isNegative=false;
        int reversed=0;
        int digit=0;
        if (x<0){
            isNegative=true;
            x=-x;
        }

        while(x>0){
            digit=x%10;
            x/=10;

            if (reversed> (Integer.MAX_VALUE - digit)/10){
                return 0;
            }
            reversed=(reversed*10)+digit;

        }

        return isNegative? -reversed:reversed;
    }
}