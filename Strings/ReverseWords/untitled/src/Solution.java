import java.util.ArrayList;
import java.util.List;

class Solution {

    public static void main(String[] args) {
        String s = "  hello world  ";
        System.out.println(reverseWords(s));

    }
    
    public static String reverseWords(String s) {
        int n = s.length();
        List<String> words = new ArrayList<>();
        int start=0;
        int end=0;

        int i=0;
        while (i <n){

            while (i < n && s.charAt(i)==' '){
                i++;
            }

            if (i>=n){
                break;
            }
            start=i;

            while (i < n && s.charAt(i)!=' '){
                i++;
            }
            end=i;

            String wordFound = s.substring(start ,end);
            words.add(wordFound);
        }

        StringBuilder ans = new StringBuilder();

        for(int j= words.size()-1 ; j >=0 ; j--){
            ans.append(words.get(j));
            if (j!=0) ans.append(' ');

        }
        System.out.println(ans.length());
        return ans.toString();
    }
}