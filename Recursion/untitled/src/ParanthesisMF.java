import java.util.ArrayList;
import java.util.List;

public class ParanthesisMF {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(2));
    }

    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        generateAll(sb, 0 , 0 , n , ans);
        return ans;
    }

    public static void generateAll(StringBuilder sb , int open , int close , int n , List<String> ans){
        if (open+close == 2*n){
            ans.add(sb.toString());
            return;
        }

        if(open < n){
            sb.append('(');
            generateAll(sb, open+1 , close , n , ans);
            sb.deleteCharAt(sb.length()-1);
        }

        if(close < open){
            sb.append(')');
            generateAll(sb , open , close+1, n , ans);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
