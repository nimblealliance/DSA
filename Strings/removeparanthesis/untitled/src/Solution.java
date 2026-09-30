public class Solution {


    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        System.out.println(removeOuterParentheses(s));

    }

    public static String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();

        int count = 0;

        for (char c : s.toCharArray()){

            if (c == '('){
                if (count >0){
                    ans.append('(');
                }
                count++;

            } else if (c == ')') {

                count--;
                if (count >0){
                    ans.append(')');
                }
            }
        }
        return ans.toString();
    }
}
