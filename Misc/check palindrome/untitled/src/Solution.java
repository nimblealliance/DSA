class Solution {

    public static void main(String[] args) {
        System.out.println( isPalindrome(12));

    }

    public static boolean isPalindrome(int x) {

        if (x<0){
            return false;
        }

        String num = Integer.toString(x);
        int l=0;
        int r=num.length()-1;

        while (l<r){
            if (num.charAt(l)!=num.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;

    }
}