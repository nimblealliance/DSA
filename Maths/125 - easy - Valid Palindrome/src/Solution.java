import java.util.Locale;

public class Solution {

    public static void main(String[] args) {
        String s ="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));


    }

    static boolean isPalindrome(String s){

        s=s.toLowerCase(Locale.ROOT).replaceAll("[^a-z0-9]", "");
        int left = 0;
        int right=s.length()-1;

        while(left<right){
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }

}
