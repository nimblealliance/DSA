import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram2(s,t));
    }

    public static boolean isAnagram2(String s, String t) {

        if (s.length()!=t.length()){
            return false;
        }

        int[] characters = new int[26];

        for (char sChar : s.toCharArray()){
            characters[sChar -  'a']++; // increment the value for every character seen in s string , subtracting it from 'a' char value gives you unicode value within 26
            // eg 'c' - 'a' = 99 - 97 = 2 , so third value in the zero based indexed array which is c.
        }

        for (char tChar : t.toCharArray()){
            characters[tChar - 'a']--;
        }

        // so values present in both strings will cancel out each other  , only thing that will remain is the characters which are not common
        for (int i : characters){
            if (i !=0){ // if the value hasn't been canceled out to zero , that means the strings are not anagrams
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagram(String s, String t) {

        if (s.length()!=t.length()){
            return false;
        }

        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();

        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);

        return Arrays.equals(sCharArray,tCharArray);
    }
}
