public class removeParenthesesBS {


    public static void main(String[] args) {

        String s = "(()())(())";

        StringBuilder ans = new StringBuilder();
        int count=0;

        for(char c : s.toCharArray()){
            if (c == '('){
                if (count > 0){
                    ans.append('(');
                }
                count++;
            }else{
                count--;
                if (count>0){
                    ans.append(')');
                }
            }
        }
        System.out.println(ans);
    }
}
