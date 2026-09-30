public class LongestCommonMF {

    public static void main(String[] args) {


    }

    public static String longestCommonPrefix(String[] strs) {
        String firstWord=strs[0];
        StringBuilder ans = new StringBuilder();
        int n = firstWord.length();

        for (int i = 0; i < n; i++) {
            char currentChar = firstWord.charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i>=strs[j].length() || strs[j].charAt(i) != currentChar) {
                    // we are checking if i >= current string's length to avoid index out of bounds exception since the first string can be bigger than the subsequent ones
                    // e g, ["aaa" , "aa"] , here the first string has 3 characters, and it will be used as firstWord , so if we check for 3 character in "aa" , it will cause out of
                    //bounds error so we do that simple check
                    return ans.toString(); // if the checks in the if block fail return whatever we have appended until now.
                }
            }
            ans.append(currentChar);
        }
        return ans.toString();
    }


}
