class Solution2 {


    public static void main(String[] args) {
        int x= 1534236469;
        int reversed = reverse(x);
        System.out.println(reversed);


    }
    public static int reverse(int x) {

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
            reversed=(reversed*10)+digit;

        }

        if (reversed>Integer.MAX_VALUE){
            return 0;
        }

        return isNegative? -reversed:reversed;
    }
}