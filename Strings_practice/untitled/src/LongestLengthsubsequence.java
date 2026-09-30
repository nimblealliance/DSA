import java.util.HashSet;

public class LongestLengthsubsequence {

    public static void main(String[] args) {

        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));

    }


    public static int lengthOfLongestSubstring(String s) {

        int maxLength = 0;

        for (int i=0 ; i<s.length() ; i++){


            HashSet<Character> set = new HashSet<>();
            int j = i;
            while (j < s.length() && !set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
            }
            maxLength=Math.max(maxLength ,j-i);
        }
        return maxLength;
    }




}
