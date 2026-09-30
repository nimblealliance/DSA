import java.util.Arrays;
import java.util.HashMap;

class Solution {

    public static void main(String[] args) {

        String s = "foo";
        String t = "bar";
        System.out.println(isIsomorphic(s,t));

    }

    public static boolean isIsomorphic(String s, String t){

        int n = s.length();
        int[] sArray = new int[256];
        int[] tArray = new int[256];

        for (int i = 0; i < n; i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            System.out.println(Arrays.toString(sArray));
            System.out.println(Arrays.toString(tArray));
            System.out.println();

            if (sArray[sChar] != tArray[tChar]) return false;

            sArray[sChar] = i + 1;
            tArray[tChar] = i + 1;

        }

        return true;

    }



    public static boolean isIsomorphic3(String s, String t) {

        HashMap<Character,Character> sMap = new HashMap<>(256);
        HashMap<Character,Character> tMap = new HashMap<>(256);

        int n = s.length();

        for (int i = 0; i < n; i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (sMap.containsKey(sChar) && !sMap.get(sChar).equals(tChar)) return false;
            if (tMap.containsKey(tChar) && !tMap.get(tChar).equals(sChar)) return false;

            sMap.put(sChar,tChar);
            tMap.put(tChar,sChar);
        }
        return true;
    }


    public static boolean isIsomorphic2(String s, String t) {

        HashMap<Character,Character> map = new HashMap<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (map.containsKey(sChar) && !map.get(sChar).equals(tChar)) return false;
            if (map.containsValue(tChar) && !map.containsKey(sChar)) return false;

            map.put(sChar,tChar);
        }
        return true;
    }
}