import java.util.Stack;

class Solution {
    public static void main(String[] args) {

        String s = "()";
        System.out.println(isValid(s));

    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '{' || c == '[' || c == '('){
                stack.push(c);
            }
            else {
                if(stack.isEmpty()){
                    return false;
                }

                char ch = stack.peek();

                if(c == '}' && ch == '{'){
                    stack.pop();
                }else if(c == ')' && ch == '('){
                    stack.pop();
                }else if(c == ']' && ch == '['){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}