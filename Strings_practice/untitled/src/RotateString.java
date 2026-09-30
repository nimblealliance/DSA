public class RotateString {

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        boolean b = rotateString(s, goal);
        System.out.println(b);

    }


    public static boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()){
            return false;
        }

        String concatenatedString = s+s;

        return (concatenatedString.contains(goal));
    }

}
