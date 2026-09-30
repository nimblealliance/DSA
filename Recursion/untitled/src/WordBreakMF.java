import java.util.Arrays;
import java.util.List;

public class WordBreakMF {

    public static void main(String[] args) {
        String s = "cars";
        List<String> wordDict = Arrays.asList("car","ca","rs");
        System.out.println(wordBreak(s,wordDict));

    }


    public static boolean wordBreak(String s, List<String> wordDict) {
        return wordBreaker(s , wordDict , 0);
    }

    public static boolean wordBreaker(String s , List<String> wordDict , int ind){

        if(ind == s.length()){
            return true;
        }

        for(int j = ind ; j<s.length(); j++){

            String x = s.substring(ind , j+1);
            if(wordDict.contains(x)){
                if(wordBreaker(s, wordDict , j+1)){
                    return true;
                }
            }
        }
        return false;
    }

}
