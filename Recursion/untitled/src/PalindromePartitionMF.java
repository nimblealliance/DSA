import java.util.ArrayList;
import java.util.List;

public class PalindromePartitionMF {

    public static void main(String[] args) {
        String s = "aabaa";
        System.out.println(partition(s));
    }


    public static List<List<String>> partition(String s) {
        StringBuilder sb = new StringBuilder();
        List<List<String>> ans = new ArrayList<>();
        generateAllPalindromicPartitions(s , sb , 0 , ans);
        return ans;
    }

    public static void generateAllPalindromicPartitions(String s , StringBuilder sb , int ind , List<List<String>> ans){
        if(sb.length() !=0 && (isPalindrome(sb.toString(),0,sb.length()-1))){
            List<String> temp = new ArrayList<>();
            temp.add(sb.toString());
            ans.add(new ArrayList<>(temp));
            return;
        }

        if(ind == s.length()){
            return;
        }

        sb.append(s.charAt(ind));
        generateAllPalindromicPartitions(s,sb,ind+1,ans);
        sb.deleteCharAt(sb.length()-1);

        generateAllPalindromicPartitions(s,sb,ind+1,ans);

    }


    public static boolean isPalindrome(String s , int start , int end){
        while(start <= end){
            if(s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }else {
                return false;
            }
        }
        return true;
    }
}
