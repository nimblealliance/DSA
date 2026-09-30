import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class FrequencySort {

    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(frequencySort(s));
    }


    public static String frequencySort(String s) {

        HashMap<Character , Integer> map = new HashMap<>();

        for (char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        ArrayList<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list , (a , b ) -> map.get(b)-map.get(a));
        StringBuilder sb = new StringBuilder();
        for (Character c : list){
            for (int i=0 ; i<map.get(c); i++){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
