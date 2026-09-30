import java.util.HashMap;

public class anagrammf {

    public static void main(String[] args) {

    }


    public static boolean isAnagram2(String s , String t){

        if (s.length() != t.length()){
            return false;
        }
        int [] count = new int[26];

        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count[c-'a']++;
        }

        for (int i = 0; i < n; i++) {
            char c = t.charAt(i);
            count[c-'a']--;
        }
        for (int i = 0; i < count.length; i++) {
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }


    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()){
            return false;
        }
        HashMap<Character , Integer> map = new HashMap<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {

            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);

        }
        for (int i = 0; i < n; i++) {

            char d = t.charAt(i);
            if (map.containsKey(d)){
                map.put(d, map.getOrDefault(d,0)-1);
            }else {
                return false;
            }
        }

        for (Integer value : map.values()) {
            if (value!=0){
                return false;
            }
        }
        return true;
    }


}
