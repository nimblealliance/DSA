import java.util.ArrayList;
import java.util.List;

public class reverseWordsBS {

    public static void main(String[] args) {
        System.out.println(reverseWords(" a good     example  "));

    }

    public static String reverseWords(String s){

        StringBuilder ans = new StringBuilder();
        int n = s.length();
        List<String> words = new ArrayList<>();
        int i = 0;
        int start =0;
        int end =0;

        while (i<n){

            while (i< n && s.charAt(i)==' '){
                i++;
            }

            if (i >=n){
                break;
            }

            start=i;

            while (i< n && s.charAt(i)!=' '){
                i++;
            }
            end=i;
            words.add(s.substring(start , end));

        }

        for ( int j = words.size()-1 ; j >=0 ; j--){
            ans.append(words.get(j));
            if (j!=0){
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}
