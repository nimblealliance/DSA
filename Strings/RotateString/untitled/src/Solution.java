public class Solution {

    public static void main(String[] args) {
        String s= "abcde";
        String goal= "cdeab";
        System.out.println(rotateString2(s,goal));

    }

    public static boolean rotateString2 (String s , String goal){

        if (s.length() != goal.length()){
            return false;
        }

        String concatenatedString = s + s; // concatenating a string to itself will get you all possible rotation substring in it , it can be either left or right , try it for abcde
        int n = concatenatedString.length();
        for (int i = 0; i < n; i++) {
            if (concatenatedString.substring(i).contains(goal)){
                return true;
            }
        }
        return false;
    }


    public static boolean rotateString (String s , String goal){

        if (s.length() != goal.length()){
            return false;
        }
        int n = s.length();
        for (int i = 0; i < n; i++) {
            System.out.println("Substring of i : "+s.substring(i));
            System.out.println("Substring of 0 to i : "+s.substring(0, i));
            String rotatedString = s.substring(i) + s.substring(0, i);
            System.out.println(rotatedString);
            System.out.println();
                if (rotatedString.equals(goal)){
                    return true;
                }

        }
        return false;
    }


}
