class Solution {

    public static void main(String[] args) {
        int x=121;
        System.out.println(isPalindrome(x));

    }

    public static boolean isPalindrome(int x) {
        int digit=0;
        int ans=0;
        int original=x;
        if (x<0){
            return false;
        }

        while(x>0){
            digit=x%10;
            ans=(ans*10)+digit;
            x=x/10;
        }
        System.out.println(ans);

        if (original==ans){
            return true;
        }
        return false;

    }
}